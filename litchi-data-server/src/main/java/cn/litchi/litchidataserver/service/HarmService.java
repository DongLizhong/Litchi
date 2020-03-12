package cn.litchi.litchidataserver.service;

import cn.litchi.model.mapper.LzHarmDao;
import cn.litchi.model.model.DBLzHarm;
import cn.litchi.model.utils.DateUtils;
import cn.litchi.rpc.HarmServiceRpc;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

import static cn.litchi.model.utils.CollectionsUtilsExtend.checkListNotNull;

@RestController
public class HarmService implements HarmServiceRpc {

    @Autowired
    private LzHarmDao harmDao;

    @Override
    public List<DBLzHarm> getHarmList(String type) {
        if (StringUtils.isBlank(type)) return Collections.emptyList();
        QueryWrapper<DBLzHarm> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(DBLzHarm.TYPE_FIELD, type);
        List<DBLzHarm> harmList = harmDao.selectList(queryWrapper);
        return checkListNotNull(harmList);
    }

    @Override
    public DBLzHarm getHarmById(Long id) {
        return harmDao.selectById(id);
    }

    @Override
    public Boolean addHarm(DBLzHarm harm) {
        harm.setCreateTime(DateUtils.getNowTimeAsEpochMilli());
        harm.setUpdateTime(DateUtils.getNowTimeAsEpochMilli());
        return harmDao.insert(harm) == 1;
    }
}
