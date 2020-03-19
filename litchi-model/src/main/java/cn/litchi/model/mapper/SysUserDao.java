package cn.litchi.model.mapper;

import cn.litchi.model.model.DBSysUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface SysUserDao extends BaseMapper<DBSysUser> {

    @Select("SELECT * FROM sys_user where username = #{name}")
    DBSysUser findByUserName(@Param("name") String name);
}
