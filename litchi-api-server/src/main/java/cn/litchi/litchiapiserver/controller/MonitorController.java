package cn.litchi.litchiapiserver.controller;

import cn.litchi.model.model.DBLzMonitorRegulationGroup;
import cn.litchi.model.model.DBSysUser;
import cn.litchi.model.utils.MallResult;
import cn.litchi.rpc.MonitorServiceRpc;
import cn.litchi.rpc.UserServiceRpc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.security.sasl.SaslServer;
import java.util.List;

@RestController
@RequestMapping("/api/monitor")
public class MonitorController {

    @Autowired
    private UserServiceRpc userRpc;
    @Autowired
    private MonitorServiceRpc monitorRpc;

    @GetMapping("/group/list")
    public MallResult getMonitorGroupList(
            @RequestParam(value = "offset", required = false, defaultValue = "0") int offset,
            @RequestParam(value = "limit", required = false, defaultValue = "1000") int limit,
            Authentication authResult) {
        List<DBLzMonitorRegulationGroup> groupList = monitorRpc.getMonitorGroupList(offset, limit);
        return MallResult.ok(groupList);
    }

    @PostMapping("/group")
    public MallResult addMonitorGroup(@RequestBody DBLzMonitorRegulationGroup group,
                                      Authentication authResult) {
        String name = authResult.getName();
        DBSysUser user = userRpc.getUserByName(name);
        group.setOrchardId(user.getOrchardId());
        System.out.println(group);
        DBLzMonitorRegulationGroup rsp = monitorRpc.addMonitorGroup(group);
        return MallResult.ok(rsp);
    }
}
