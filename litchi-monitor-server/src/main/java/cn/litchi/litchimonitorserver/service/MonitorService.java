package cn.litchi.litchimonitorserver.service;

import cn.litchi.model.mapper.LzMonitorRegulationGroupDao;
import cn.litchi.model.mapper.LzMonitorRegulationItemDao;
import cn.litchi.model.model.DBLzMonitorRegulationGroup;
import cn.litchi.model.model.DBLzMonitorRegulationItem;
import cn.litchi.model.utils.DateUtils;
import cn.litchi.rpc.MonitorServiceRpc;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.Collections;
import java.util.List;

import static cn.litchi.model.utils.DateUtils.dayOfYear;

@RestController
public class MonitorService implements MonitorServiceRpc {
    @Autowired
    private LzMonitorRegulationGroupDao groupDao;
    @Autowired
    private LzMonitorRegulationItemDao itemDao;

    @Override

    public List<DBLzMonitorRegulationGroup> getMonitorGroupList(int offset, int limit) {
        List<DBLzMonitorRegulationGroup> groups
                = groupDao.selectPage(new Page<>(offset, limit), null).getRecords();
        if (CollectionUtils.isEmpty(groups)) {
            return Collections.emptyList();
        } else {
            return groups;
        }
    }

    @Override
    public DBLzMonitorRegulationGroup addMonitorGroup(@RequestBody DBLzMonitorRegulationGroup group) {
        group.setCreateTime(Instant.now());
        group.setUpdateTime(Instant.now());
        group.setBeginDay(dayOfYear(group.getBeginDate()));
        group.setEndDay(dayOfYear(group.getEndDate()));
        groupDao.insert(group);
//        group.getItems().forEach(it -> itemDao.insert(it));
        return group;
    }

    @Override
    public Boolean updateMonitorGroup(DBLzMonitorRegulationGroup group) {
        groupDao.updateById(group);
        QueryWrapper<DBLzMonitorRegulationItem> wrapper
                = new QueryWrapper<DBLzMonitorRegulationItem>().eq(DBLzMonitorRegulationItem.GROUP_ID_FIELD, group.getId());
        group.getItems().forEach(it ->
                itemDao.update(it, wrapper));
        return true;
    }

    @Override
    public Boolean deleteMonitorGroup(Long id) {
        QueryWrapper<DBLzMonitorRegulationItem> queryWrapper
                = new QueryWrapper();
        queryWrapper.eq(DBLzMonitorRegulationItem.GROUP_ID_FIELD, id);
        groupDao.deleteById(id);
        itemDao.delete(queryWrapper);
        return true;
    }

    @Override
    public Boolean enableMonitorGroup(Long id) {
        return groupDao.updateById(DBLzMonitorRegulationGroup.builder().enable(true).build()) == 1;
    }

    @Override
    public Boolean disableMonitorGroup(Long id) {
        return groupDao.updateById(DBLzMonitorRegulationGroup.builder().enable(false).build()) == 1;
    }

    @Override
    public Boolean enableMonitorItem(Long id) {
        return itemDao.updateById(DBLzMonitorRegulationItem.builder().enable(true).build()) == 1;
    }

    @Override
    public Boolean disableMonitorItem(Long id) {
        return itemDao.updateById(DBLzMonitorRegulationItem.builder().enable(false).build()) == 1;
    }
}
