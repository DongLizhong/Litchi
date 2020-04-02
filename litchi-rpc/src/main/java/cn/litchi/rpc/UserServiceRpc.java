package cn.litchi.rpc;

import cn.litchi.model.model.DBSysUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "litchi-customer-server")
@RequestMapping("/customer")
public interface UserServiceRpc {

    @GetMapping("/basic_info")
    DBSysUser getUserByName(@RequestParam("name") String name);

    @PostMapping("/add")
    DBSysUser addUser(@RequestBody DBSysUser user, @RequestParam("role") String role);

}
