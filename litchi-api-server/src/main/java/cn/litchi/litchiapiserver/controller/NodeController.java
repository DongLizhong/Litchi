package cn.litchi.litchiapiserver.controller;

import cn.litchi.model.model.DBLzNode;
import cn.litchi.model.model.DBSysUser;
import cn.litchi.model.request.NodeQueryReq;
import cn.litchi.model.utils.MallResult;
import cn.litchi.rpc.NodeServiceRpc;
import cn.litchi.rpc.UserServiceRpc;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/node")
public class NodeController extends BaseController {

    @Autowired
    private NodeServiceRpc nodeService;
    @Autowired
    private UserServiceRpc userRpc;

    @GetMapping("/list")
    public MallResult getNodeList() {
        List<DBLzNode> nodes = nodeService.getNodeList();
        if (nodes.isEmpty()) {
            return MallResult.ok();
        }
        return MallResult.ok(nodes);
    }

    @DeleteMapping("")
    public MallResult deleteNode(@RequestParam("id") Long nodeId) {
        return nodeService.deleteNode(nodeId) ? MallResult.ok() : MallResult.build(401, "删除失败");
    }

    @PostMapping("")
    public MallResult addNode(@RequestBody DBLzNode node, Authentication authResult) {
        String name = authResult.getName();
        DBSysUser user = userRpc.getUserByName(name);
        node.setOrchardId(user.getOrchardId());
        nodeService.addNode(node);
        return MallResult.ok(node);
    }

    @PostMapping("/query")
    public MallResult queryNode(@RequestBody NodeQueryReq req) {
        return MallResult.ok(nodeService.queryNode(req));
    }

}
