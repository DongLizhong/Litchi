package cn.litchi.litchiapiserver.controller;

import cn.litchi.model.model.DBSysUser;
import cn.litchi.model.utils.MallResult;
import cn.litchi.model.utils.MallResultStatus;
import cn.litchi.rpc.UserServiceRpc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static cn.litchi.model.utils.StringUtils.trim;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private PasswordEncoder encoder;
    @Autowired
    private UserServiceRpc userRpc;

    private static final String ADMIN_ROLE = "ROLE_admin";

    private static final String USER_ROLE = "ROLE_user";

    @PostMapping("/admin/add")
    public MallResult addAdmin(@RequestBody DBSysUser user) {
        DBSysUser sysUser = userRpc.getUserByName(trim(user.getUsername()));
        if (sysUser != null) {
            user.setPassword(encoder.encode(user.getPassword()));
            DBSysUser admin = userRpc.addUser(user, ADMIN_ROLE);
            return MallResult.ok(admin);
        } else {
            return MallResult.build(MallResultStatus.USER_NAME_HAVE_USED, "用户名已被占用");
        }
    }

    @PostMapping("/register")
    public MallResult registerUser(@RequestBody DBSysUser user) {
        DBSysUser sysUser = userRpc.getUserByName(trim(user.getUsername()));
        if (sysUser != null) {
            user.setPassword(encoder.encode(user.getPassword()));
            DBSysUser admin = userRpc.addUser(user, USER_ROLE);
            return MallResult.ok(admin);
        } else {
            return MallResult.build(MallResultStatus.USER_NAME_HAVE_USED, "用户名已被占用");
        }
    }

    @GetMapping("/info")
    public MallResult getUser(Authentication authResult) {
        String name = authResult.getName();
        DBSysUser user = userRpc.getUserByName(name);
        return MallResult.ok(user);
    }

    @PostMapping("logout")
    public MallResult userLogout(Authentication authResult){
        return MallResult.ok();
    }
}
