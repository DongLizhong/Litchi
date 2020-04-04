package cn.litchi.litchidataserver.service;

import cn.litchi.model.mapper.LzNodeDataDao;
import cn.litchi.model.model.DBLzNodeData;
import cn.litchi.model.utils.DateUtils;
import cn.litchi.rpc.NodeDataServiceRpc;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

import static cn.litchi.model.utils.CollectionsUtilsExtend.checkListNotNull;
import static cn.litchi.model.utils.DateUtils.checkNodeDataParamDay;

@RestController
public class NodeDataService implements NodeDataServiceRpc {

    @Autowired
    private LzNodeDataDao nodeDataDao;

    @Override
    public List<DBLzNodeData> selectDatasByNodeId(@RequestParam("nodeId") Long nodeId) {
        QueryWrapper<DBLzNodeData> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(DBLzNodeData.NODE_ID_FIELD, nodeId);
        List<DBLzNodeData> datas = nodeDataDao.selectList(queryWrapper);
        return checkListNotNull(datas);
    }

    @Override
    public List<DBLzNodeData> selectLastestNDayDatasByNodeId(@RequestParam("nodeId") Long nodeId,
                                                             @RequestParam("nday") int nday) {
        long queryTime = DateUtils.getEpochMilliAtStartofDayByMinusDays(checkNodeDataParamDay(nday));
        QueryWrapper<DBLzNodeData> queryWrapper = new QueryWrapper<>();
        queryWrapper.ge(DBLzNodeData.TIME_FIELD, queryTime).eq(DBLzNodeData.NODE_ID_FIELD, nodeId);
        List<DBLzNodeData> datas = nodeDataDao.selectList(queryWrapper);
        return checkListNotNull(datas);
    }

    @Override
    public List<DBLzNodeData> selectIntervalDatasByDateAndNodeId(@RequestParam("beginDate") LocalDate beginDate,
                                                                 @RequestParam("endDate") LocalDate endDate,
                                                                 @RequestParam("nodeId") Long nodeId) {
        long startOfDay = DateUtils.getEpochMilliAtStartofDay(beginDate);
        long endOfDay = DateUtils.getEpochMilliAtEndofDay(endDate);
        QueryWrapper<DBLzNodeData> queryWrapper = new QueryWrapper<>();
        queryWrapper.ge(DBLzNodeData.TIME_FIELD, startOfDay)
                .le(DBLzNodeData.TIME_FIELD, endOfDay)
                .eq(DBLzNodeData.NODE_ID_FIELD, nodeId);
        List<DBLzNodeData> datas = nodeDataDao.selectList(queryWrapper);
        return checkListNotNull(datas);
    }
}
