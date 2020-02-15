package cn.litchi.litchisourceserver.mapper;

import cn.litchi.model.entity.LzText;
import cn.litchi.model.entity.LzTextExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface LzTextMapper {
    int countByExample(LzTextExample example);

    int deleteByExample(LzTextExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LzText record);

    int insertSelective(LzText record);

    List<LzText> selectByExample(LzTextExample example);

    LzText selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LzText record, @Param("example") LzTextExample example);

    int updateByExample(@Param("record") LzText record, @Param("example") LzTextExample example);

    int updateByPrimaryKeySelective(LzText record);

    int updateByPrimaryKey(LzText record);
}