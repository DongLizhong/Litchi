package cn.litchi.litchidataserver.newservice;

import cn.litchi.model.mapper.LzNodeDao;
import cn.litchi.model.model.LzNode;
import cn.litchi.model.utils.DateUtils;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static cn.litchi.model.utils.CollectionsUtilsExtend.checkListNotNull;

@RestController
public class NodeService {

    @Autowired
    private LzNodeDao lzNodeDao;

    public List<LzNode> getNodeList() {
        QueryWrapper<LzNode> queryWrapper = new QueryWrapper<>();
        List<LzNode> nodes = lzNodeDao.selectList(queryWrapper);
        return checkListNotNull(nodes);
    }

    public Boolean addNode(@RequestBody LzNode node) {
        node.setCreateTime(DateUtils.getNowTimeAsEpochMilli());
        node.setUpdateTime(DateUtils.getNowTimeAsEpochMilli());
        return lzNodeDao.insert(node) == 1;
    }

    public Boolean deleteNode(Long nodeId) {
        return lzNodeDao.deleteById(nodeId) == 1;
    }
}
