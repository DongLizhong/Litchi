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
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class MonitorScheduled {

    @Autowired
    private LzMonitorRegulationGroupDao groupDao;
    @Autowired
    private LzNodeDataDao dataDao;
    @Autowired
    private LzSystemConfigDao sysDao;


    @Scheduled(fixedRate = 3600000)
    public void monitor() {
        // 查找出当下有效的规则组
        int now = LocalDate.now().getDayOfYear();
        QueryWrapper<DBLzMonitorRegulationGroup> wrapper = new QueryWrapper<>();
        wrapper.lambda().ge(DBLzMonitorRegulationGroup::getBeginDate, now)
                .le(DBLzMonitorRegulationGroup::getEndDate, now)
                .eq(DBLzMonitorRegulationGroup::getEnable, true);
        List<DBLzMonitorRegulationGroup> groups = groupDao.selectList(wrapper);

        // 找出规则组中要求监控的最长时间，用于按时间获取 nodeData
        Long keepMinutes = Collections.max(Collections.max(groups).getItems()).getKeepMinutes();
        QueryWrapper<DBLzNodeData> dataQueryWrapper = new QueryWrapper<>();
        dataQueryWrapper.lambda().ge(DBLzNodeData::getTime, Instant.now().minusSeconds(keepMinutes));
        // TODO 还需要对 nodeId 进行限定，只查出想要的 nodeId 对应的数据 group表需要增加一个应用的nodeId列表
        List<DBLzNodeData> data = dataDao.selectList(dataQueryWrapper);
        Map<Long, List<DBLzNodeData>> dataMap = data.stream().collect(
                Collectors.groupingBy(
                        DBLzNodeData::getNodeId, Collectors.toList()
                ));
        dataMap.forEach(this::handler);
    }

    private void handler(Long nodeId, List<DBLzNodeData> data) {
        // TODO 监控数据处理
    }
}
