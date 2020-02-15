package cn.litchi.litchidataserver.newservice;

import cn.litchi.model.mapper.LzHarmDao;
import cn.litchi.model.model.LzHarm;
import cn.litchi.model.utils.DateUtils;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

import static cn.litchi.model.utils.CollectionsUtilsExtend.checkListNotNull;

@RestController
public class HarmService {

    @Autowired
    private LzHarmDao harmDao;

    public List<LzHarm> getHarmList(String type) {
        if (StringUtils.isBlank(type)) return Collections.emptyList();
        QueryWrapper<LzHarm> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(LzHarm.TYPE_FIELD, type);
        List<LzHarm> harmList = harmDao.selectList(queryWrapper);
        return checkListNotNull(harmList);
    }

    public LzHarm getHarmById(Long id) {
        return harmDao.selectById(id);
    }

    public Boolean addHarm(LzHarm harm) {
        harm.setCreateTime(DateUtils.getNowTimeAsEpochMilli());
        harm.setUpdateTime(DateUtils.getNowTimeAsEpochMilli());
        return harmDao.insert(harm) == 1;
    }
}
