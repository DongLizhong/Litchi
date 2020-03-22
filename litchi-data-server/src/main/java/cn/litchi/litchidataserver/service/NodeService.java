package cn.litchi.litchidataserver.service;

import cn.litchi.model.mapper.LzNodeDao;
import cn.litchi.model.model.DBLzNode;
import cn.litchi.rpc.NodeServiceRpc;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.List;

import static cn.litchi.model.utils.CollectionsUtilsExtend.checkListNotNull;

@RestController
public class NodeService implements NodeServiceRpc {

    @Autowired
    private LzNodeDao lzNodeDao;

    @Override
    public List<DBLzNode> getNodeList() {
        QueryWrapper<DBLzNode> queryWrapper = new QueryWrapper<>();
        List<DBLzNode> nodes = lzNodeDao.selectList(queryWrapper);
        return checkListNotNull(nodes);
    }

    @Override
    public Boolean addNode(@RequestBody DBLzNode node) {
        node.setCreateTime(Instant.now());
        node.setUpdateTime(Instant.now());
//        node.setToken(TokenUtils.getToken(node.getId(), node.getOrchardId() + node.getNodeTypeId()));
        return lzNodeDao.insert(node) == 1;
    }

    @Override
    public Boolean deleteNode(Long nodeId) {
        return lzNodeDao.deleteById(nodeId) == 1;
    }
}
