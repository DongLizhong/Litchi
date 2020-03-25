package cn.litchi.customerserver.service;

import cn.litchi.model.mapper.SysUserDao;
import cn.litchi.model.model.DBSysUser;
import cn.litchi.rpc.UserServiceRpc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerService implements UserServiceRpc {

    @Autowired
    private SysUserDao userDao;

    @Override
    @Cacheable(value = "litchi:data:user-get-user-by-name",
            key = "':' + #name",
            unless = "#result==null")
    public DBSysUser getUserByName(String name) {
        return userDao.findByUserName(name);
    }
}
