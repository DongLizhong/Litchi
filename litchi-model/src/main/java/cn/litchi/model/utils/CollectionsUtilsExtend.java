package cn.litchi.model.utils;

import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;

import java.util.Collections;
import java.util.List;

public class CollectionsUtilsExtend {
    public static List checkListNotNull(List list) {
        return CollectionUtils.isEmpty(list) ? Collections.EMPTY_LIST : list;
    }
}
