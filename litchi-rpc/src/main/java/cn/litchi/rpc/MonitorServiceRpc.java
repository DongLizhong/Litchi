package cn.litchi.rpc;


import cn.litchi.model.model.DBLzMonitorRegulationGroup;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "litchi-monitor-server")
@RequestMapping("/monitor")
public interface MonitorServiceRpc {
    @GetMapping("/list")
    List<DBLzMonitorRegulationGroup> getMonitorGroupList(@RequestParam("offset") int offset,
                                                         @RequestParam("limit") int limit);

    @PostMapping(value = "/add", consumes = MediaType.APPLICATION_JSON_VALUE)
    DBLzMonitorRegulationGroup addMonitorGroup(@RequestBody DBLzMonitorRegulationGroup group);

    @PostMapping(value = "update", consumes = MediaType.APPLICATION_JSON_VALUE)
    Boolean updateMonitorGroup(@RequestBody DBLzMonitorRegulationGroup group);

    @GetMapping(value = "/delete")
    Boolean deleteMonitorGroup(@RequestParam("groupId") Long id);

    @GetMapping("/enable")
    Boolean enableMonitorGroup(@RequestParam("groupId") Long id);

    @GetMapping("/disable")
    Boolean disableMonitorGroup(@RequestParam("groupId") Long id);

    @GetMapping("/item/enable")
    Boolean enableMonitorItem(@RequestParam("itemId") Long id);

    @GetMapping("/item/disable")
    Boolean disableMonitorItem(@RequestParam("itemId") Long id);
}
