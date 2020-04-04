package cn.litchi.litchiapiserver.controller;

import cn.litchi.model.model.DBLzMonitorRegulationGroup;
import cn.litchi.model.model.DBLzMonitorRegulationItem;
import cn.litchi.model.model.DBSysUser;
import cn.litchi.model.utils.MallResult;
import cn.litchi.rpc.MonitorServiceRpc;
import cn.litchi.rpc.UserServiceRpc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
            @RequestParam(value = "limit", required = false, defaultValue = "500") int limit,
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

    @GetMapping("/item/list")
    public MallResult getMonitoritemList(
            @RequestParam(value = "offset", required = false, defaultValue = "0") int offset,
            @RequestParam(value = "limit", required = false, defaultValue = "500") int limit,
            Authentication authResult) {
        List<DBLzMonitorRegulationItem> itemList = monitorRpc.getMonitorItemList(offset, limit);
        return MallResult.ok(itemList);
    }

    @PostMapping("/item")
    public MallResult addMonitoritem(@RequestBody DBLzMonitorRegulationItem item,
                                     Authentication authResult) {
        DBLzMonitorRegulationItem rsp = monitorRpc.addMonitorItem(item);
        return MallResult.ok(rsp);
    }

    @DeleteMapping("/item")
    public MallResult deletedMonitoritem(@RequestParam("id") Long itemId) {
        return monitorRpc.deleteMonitorItem(itemId) ? MallResult.ok() : MallResult.build(401, "删除失败");
    }

    @DeleteMapping("/group")
    public MallResult deletedMonitorGroup(@RequestParam("id") Long groupId) {
        return monitorRpc.deleteMonitorGroup(groupId) ? MallResult.ok() : MallResult.build(401, "删除失败");
    }
}
