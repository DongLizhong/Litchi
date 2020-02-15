package cn.litchi.litchisourceserver.mapper;

import cn.litchi.model.entity.LzAdministrator;
import cn.litchi.model.entity.LzAdministratorExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface LzAdministratorMapper {
    int countByExample(LzAdministratorExample example);

    int deleteByExample(LzAdministratorExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LzAdministrator record);

    int insertSelective(LzAdministrator record);

    List<LzAdministrator> selectByExample(LzAdministratorExample example);

    LzAdministrator selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LzAdministrator record, @Param("example") LzAdministratorExample example);

    int updateByExample(@Param("record") LzAdministrator record, @Param("example") LzAdministratorExample example);

    int updateByPrimaryKeySelective(LzAdministrator record);

    int updateByPrimaryKey(LzAdministrator record);
}