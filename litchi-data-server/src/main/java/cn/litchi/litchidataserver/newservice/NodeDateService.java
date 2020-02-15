package cn.litchi.litchidataserver.newservice;

import cn.litchi.model.mapper.LzNodeDataDao;
import cn.litchi.model.model.LzNodeData;
import cn.litchi.model.utils.DateUtils;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

import static cn.litchi.model.utils.CollectionsUtilsExtend.checkListNotNull;
import static cn.litchi.model.utils.DateUtils.checkNodeDataParamDay;

@RestController
public class NodeDateService {

    @Autowired
    private LzNodeDataDao nodeDataDao;

    public List<LzNodeData> selectDatasByNodeId(Long nodeId) {
        QueryWrapper<LzNodeData> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(LzNodeData.NODE_ID_FIELD, nodeId);
        List<LzNodeData> datas = nodeDataDao.selectList(queryWrapper);
        return checkListNotNull(datas);
    }


    public List<LzNodeData> selectLastestNDayDatasByNodeId(Long nodeId, int nday) {
        long queryTime = DateUtils.getEpochMilliAtStartofDayByMinusDays(checkNodeDataParamDay(nday));
        QueryWrapper<LzNodeData> queryWrapper = new QueryWrapper<>();
        queryWrapper.ge(LzNodeData.TIME_FIELD, queryTime).eq(LzNodeData.NODE_ID_FIELD, nodeId);
        List<LzNodeData> datas = nodeDataDao.selectList(queryWrapper);
        return checkListNotNull(datas);
    }


    public List<LzNodeData> selectIntervalDatasByDateAndNodeId(LocalDate beginDate, LocalDate endDate, Long nodeId) {
        long startOfDay = DateUtils.getEpochMilliAtStartofDay(beginDate);
        long endOfDay = DateUtils.getEpochMilliAtEndofDay(endDate);
        QueryWrapper<LzNodeData> queryWrapper = new QueryWrapper<>();
        queryWrapper.ge(LzNodeData.TIME_FIELD, startOfDay)
                .le(LzNodeData.TIME_FIELD, endOfDay)
                .eq(LzNodeData.NODE_ID_FIELD, nodeId);
        List<LzNodeData> datas = nodeDataDao.selectList(queryWrapper);
        return checkListNotNull(datas);
    }
}
