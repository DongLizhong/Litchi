package cn.litchi.litchimonitorserver.scheduled;

import cn.litchi.model.mapper.LzMonitorRegulationGroupDao;
import cn.litchi.model.mapper.LzNodeDataDao;
import cn.litchi.model.mapper.LzSystemConfigDao;
import cn.litchi.model.model.DBLzMonitorRegulationGroup;
import cn.litchi.model.model.DBLzNodeData;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class MonitorScheduled {

    @Autowired
    private LzMonitorRegulationGroupDao groupDao;
    @Autowired
    private LzNodeDataDao dataDao;
    @Autowired
    private LzSystemConfigDao sysDao;


    // TODO 监控周期应该从数据库中动态获取
    @Scheduled(fixedRate = 3600000)
    public void monitor() {
        // 查找出当下有效的规则组
        int now = LocalDate.now().getDayOfYear();
        QueryWrapper<DBLzMonitorRegulationGroup> wrapper = new QueryWrapper<>();
        wrapper.lambda().le(DBLzMonitorRegulationGroup::getBeginDay, now)
                .ge(DBLzMonitorRegulationGroup::getEndDay, now)
                .eq(DBLzMonitorRegulationGroup::getEnable, true);
        List<DBLzMonitorRegulationGroup> groups = groupDao.selectList(wrapper);

        // 找出规则组中要求监控的最长时间，用于按时间获取 nodeData
        Set<Long> nodeSet = new HashSet<>();
        groups.forEach(it -> nodeSet.addAll(it.getNodeList()));
        Long keepMinutes = Collections.max(Collections.max(groups).getItems()).getKeepMinutes();
        QueryWrapper<DBLzNodeData> dataQueryWrapper = new QueryWrapper<>();
        dataQueryWrapper.lambda()
                .ge(DBLzNodeData::getTime, Instant.now().minusSeconds(keepMinutes))
                .in(DBLzNodeData::getNodeId, nodeSet);
        List<DBLzNodeData> data = dataDao.selectList(dataQueryWrapper);
        Map<Long, List<DBLzNodeData>> dataMap = data.stream()
                .collect(Collectors.groupingBy(DBLzNodeData::getNodeId));

        dataMap.forEach((nodeId, datas) -> {
                    List<DBLzMonitorRegulationGroup> currentGroups
                            = groups.stream()
                            .filter(group -> group.getNodeList().contains(nodeId))
                            .collect(Collectors.toList());
                    this.handler(nodeId, datas, currentGroups);
                }
        );

    }

    private void handler(Long nodeId, List<DBLzNodeData> data, List<DBLzMonitorRegulationGroup> groups) {
        // TODO 监控数据处理
    }
}
