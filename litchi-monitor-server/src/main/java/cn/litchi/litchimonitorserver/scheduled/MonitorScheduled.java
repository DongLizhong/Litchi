package cn.litchi.litchimonitorserver.scheduled;

import cn.litchi.model.mapper.LzMonitorRegulationGroupDao;
import cn.litchi.model.mapper.LzNodeDataDao;
import cn.litchi.model.mapper.LzSystemConfigDao;
import cn.litchi.model.model.DBLzMonitorRegulationGroup;
import cn.litchi.model.model.DBLzMonitorRegulationItem;
import cn.litchi.model.model.DBLzNodeData;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;

@Component
public class MonitorScheduled {

    @Autowired
    private LzMonitorRegulationGroupDao groupDao;
    @Autowired
    private LzNodeDataDao dataDao;
    @Autowired
    private LzSystemConfigDao sysDao;

    // 系统报警调节参数，当监控情况到达用户设置参数的 ALARM_THRESHOLD 倍数时，则会告警。
    // TODO 配置于数据库，需要考虑不同监控情况的处理。原本是设计成 == 1.0 时，与用户设置规则一直， > 1.0 时更加严格，提前预警。
    private static final float ALARM_THRESHOLD = 1.0f;


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
//        Set<Long> nodeSet = new HashSet<>();
//        groups.forEach(it -> nodeSet.addAll(it.getNodeList()));
        // 计算出最长的keep_minutes
        Long keepMinutes = Collections.max(Collections.max(groups).getItems()).getKeepMinutes();
        QueryWrapper<DBLzNodeData> dataQueryWrapper = new QueryWrapper<>();
        dataQueryWrapper.lambda()
                .ge(DBLzNodeData::getTime, Instant.now().minusSeconds(keepMinutes));
        List<DBLzNodeData> data = dataDao.selectList(dataQueryWrapper);
        // 将监控数据按节点维度划分
        Map<Long, List<DBLzNodeData>> dataMap = data.stream()
                .collect(Collectors.groupingBy(DBLzNodeData::getNodeId));
        // 遍历dataMap的节点
        dataMap.forEach((nodeId, datas) -> {
                    List<DBLzMonitorRegulationGroup> currentGroups
                            = groups.stream()
                            // 过滤出作用于该节点的监控规则组
                            .filter(group -> group.getNodeList().contains(nodeId) || group.getNodeList().isEmpty())
                            .collect(Collectors.toList());
                    // 监控工厂派发监控控制器任务
                    handlerFactory(nodeId, datas, currentGroups);
                }
        );

    }

    /**
     * 单个节点监控数据处理方法
     *
     * @param nodeId
     * @param data
     * @param groups
     */
    private void handlerFactory(Long nodeId, List<DBLzNodeData> data, List<DBLzMonitorRegulationGroup> groups) {
        groups.forEach(it -> {
            Map<String, Double> log = new HashMap();
            boolean alarm = handler(it, data, log);
            if (alarm) {
                // TODO 添加记录,发布消息
            }
        });
    }

    /**
     * 单个 group 监控处理方法
     *
     * @param group
     * @param data
     * @return true:产生告警，false:不产生告警。
     */
    private boolean handler(DBLzMonitorRegulationGroup group, List<DBLzNodeData> data, Map<String, Double> log) {
        AtomicBoolean alarm = new AtomicBoolean(true);
        group.getItems().forEach(it -> {
            Integer thresholdType = it.getThresholdType();
            // 按阈值类型进行不同的处理
            if (thresholdType == DBLzMonitorRegulationItem.THRESHOLD_TYPE_AVERAGE_VALUE) {
                // 全部规则均触发的话，最后该方法返回 true。产生告警。
                alarm.set(averageValueHandler(it, data, log) && alarm.get());
            } else if (thresholdType == DBLzMonitorRegulationItem.THRESHOLD_TYPE_MIN_VALUE) {
                alarm.set(minValueHandler(it, data, log) && alarm.get());
            } else if (thresholdType == DBLzMonitorRegulationItem.THRESHOLD_TYPE_MAX_VALUE) {
                alarm.set(maxValueHandler(it, data, log) && alarm.get());
            } else {
                alarm.set(false);
            }
        });
        return alarm.get();
    }

    private boolean averageValueHandler(DBLzMonitorRegulationItem item, List<DBLzNodeData> data, Map<String, Double> log) {
        double alarmValue = ALARM_THRESHOLD * item.getThreshold();
        List<Double> monitorData = item.matchMonitorData(data);
        double value = monitorData.stream().mapToDouble(it -> it).average().getAsDouble();
        log.put(String.valueOf(item.getIndexNum()), value);
        return item.shouldAlarm(alarmValue, value);
    }

    private boolean minValueHandler(DBLzMonitorRegulationItem item, List<DBLzNodeData> data, Map<String, Double> log) {
        double alarmValue = ALARM_THRESHOLD * item.getThreshold();
        List<Double> monitorData = item.matchMonitorData(data);
        double value = monitorData.stream().mapToDouble(it -> it).min().getAsDouble();
        log.put(String.valueOf(item.getIndexNum()), value);
        return item.shouldAlarm(alarmValue, value);
    }

    private boolean maxValueHandler(DBLzMonitorRegulationItem item, List<DBLzNodeData> data, Map<String, Double> log) {
        double alarmValue = ALARM_THRESHOLD * item.getThreshold();
        List<Double> monitorData = item.matchMonitorData(data);
        double value = monitorData.stream().mapToDouble(it -> it).max().getAsDouble();
        log.put(String.valueOf(item.getIndexNum()), value);
        return item.shouldAlarm(alarmValue, value);
    }

}
