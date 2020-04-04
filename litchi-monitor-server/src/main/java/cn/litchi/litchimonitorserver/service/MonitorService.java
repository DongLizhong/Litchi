package cn.litchi.litchimonitorserver.service;

import cn.litchi.model.mapper.LzMonitorRegulationGroupDao;
import cn.litchi.model.mapper.LzMonitorRegulationItemDao;
import cn.litchi.model.model.DBLzMonitorRegulationGroup;
import cn.litchi.model.model.DBLzMonitorRegulationItem;
import cn.litchi.model.request.MonitorItemReq;
import cn.litchi.rpc.MonitorServiceRpc;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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
    public List<DBLzMonitorRegulationGroup> getMonitorGroupList(@RequestParam("offset") int offset,
                                                                @RequestParam("limit") int limit) {
        QueryWrapper<DBLzMonitorRegulationGroup> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().orderByDesc(DBLzMonitorRegulationGroup::getUpdateTime);
        List<DBLzMonitorRegulationGroup> groups
                = groupDao.selectPage(new Page<>(offset, limit), queryWrapper).getRecords();
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
    public List<DBLzMonitorRegulationItem> getMonitorItemList(@RequestParam("offset") int offset,
                                                              @RequestParam("limit") int limit) {
        QueryWrapper<DBLzMonitorRegulationItem> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().orderByDesc(DBLzMonitorRegulationItem::getUpdateTime);
        List<DBLzMonitorRegulationItem> items
                = itemDao.selectPage(new Page<>(offset, limit), queryWrapper).getRecords();
        if (CollectionUtils.isEmpty(items)) {
            return Collections.emptyList();
        } else {
            return items;
        }
    }

    @Override
    public DBLzMonitorRegulationItem addMonitorItem(@RequestBody DBLzMonitorRegulationItem item) {
        item.setCreateTime(Instant.now());
        item.setUpdateTime(Instant.now());
        itemDao.insert(item);
        return item;

    }

    @Override
    public Boolean deleteMonitorGroup(@RequestParam("groupId") Long id) {
        QueryWrapper<DBLzMonitorRegulationItem> queryWrapper
                = new QueryWrapper();
        queryWrapper.eq(DBLzMonitorRegulationItem.GROUP_ID_FIELD, id);
        int i = groupDao.deleteById(id);
        itemDao.delete(queryWrapper);
        return i == 1;
    }

    @Override
    public Boolean enableMonitorGroup(@RequestParam("groupId") Long id) {
        return groupDao.updateById(DBLzMonitorRegulationGroup.builder().enable(true).build()) == 1;
    }

    @Override
    public Boolean disableMonitorGroup(@RequestParam("groupId") Long id) {
        return groupDao.updateById(DBLzMonitorRegulationGroup.builder().enable(false).build()) == 1;
    }

    @Override
    public Boolean enableMonitorItem(@RequestParam("itemId") Long id) {
        return itemDao.updateById(DBLzMonitorRegulationItem.builder().enable(true).build()) == 1;
    }

    @Override
    public Boolean disableMonitorItem(@RequestParam("itemId") Long id) {
        return itemDao.updateById(DBLzMonitorRegulationItem.builder().enable(false).build()) == 1;
    }

    @Override
    public Boolean deleteMonitorItem(@RequestParam("itemId") Long id) {
        System.out.println("id" + id);
        return itemDao.deleteById(id) == 1;
    }

    @Override
    public List<DBLzMonitorRegulationItem> queryItem(@RequestBody MonitorItemReq req) {
        QueryWrapper<DBLzMonitorRegulationItem> queryWrapper = new QueryWrapper<>();
        if (req.getGroupId() != null) {
            queryWrapper.lambda().eq(DBLzMonitorRegulationItem::getGroupId, req.getGroupId());
        }
        int type = req.getQueryType().intValue();
        String queryKey = req.getQueryKey();
        if (type == MonitorItemReq.DATE_TYPE) {
            queryWrapper.lambda().eq(DBLzMonitorRegulationItem::getDataType, queryKey);
        } else if (type == MonitorItemReq.ROLE_NAME) {
            queryWrapper.lambda().like(DBLzMonitorRegulationItem::getName, queryKey);
        } else if (type == MonitorItemReq.THRESHOLD_TYPE) {
            int thresholdType = DBLzMonitorRegulationItem.getThresholdTypeByName(queryKey);
            queryWrapper.lambda().eq(DBLzMonitorRegulationItem::getThresholdType, thresholdType);
        }
        return itemDao.selectList(queryWrapper);
    }
}
