package cn.litchi.customerserver.service;

import cn.litchi.model.mapper.SysRoleDao;
import cn.litchi.model.mapper.SysUserDao;
import cn.litchi.model.mapper.SysUserRoleDao;
import cn.litchi.model.model.DBSysRole;
import cn.litchi.model.model.DBSysUser;
import cn.litchi.model.model.DBSysUserRole;
import cn.litchi.rpc.UserServiceRpc;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerService implements UserServiceRpc {

    @Autowired
    private SysUserDao userDao;
    @Autowired
    private SysRoleDao roleDao;
    @Autowired
    private SysUserRoleDao userRoleDao;

    @Override
//    @Cacheable(value = "litchi:data:user-get-user-by-name",
//            key = "':' + #name",
//            unless = "#result==null")
    public DBSysUser getUserByName(@RequestParam("name") String name) {
        return userDao.findByUserName(name);
    }

    @Override
    public DBSysUser addUser(@RequestBody DBSysUser user, @RequestParam("role") String role) {
        userDao.insert(user);
        QueryWrapper<DBSysRole> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(DBSysRole::getName, role);
        DBSysRole sysRole = roleDao.selectOne(queryWrapper);
        DBSysUserRole userRole = DBSysUserRole.builder()
                .sysRoleId(sysRole.getId())
                .sysUserId(user.getId())
                .build();
        userRoleDao.insert(userRole);
        return user;
    }


}
