package cn.litchi.litchisourceserver.mapper;

import cn.litchi.model.entity.LzTextType;
import cn.litchi.model.entity.LzTextTypeExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface LzTextTypeMapper {
    int countByExample(LzTextTypeExample example);

    int deleteByExample(LzTextTypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LzTextType record);

    int insertSelective(LzTextType record);

    List<LzTextType> selectByExample(LzTextTypeExample example);

    LzTextType selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LzTextType record, @Param("example") LzTextTypeExample example);

    int updateByExample(@Param("record") LzTextType record, @Param("example") LzTextTypeExample example);

    int updateByPrimaryKeySelective(LzTextType record);

    int updateByPrimaryKey(LzTextType record);
}