package cn.litchi.litchisourceserver.mapper;

import cn.litchi.model.entity.LzLitchiType;
import cn.litchi.model.entity.LzLitchiTypeExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface LzLitchiTypeMapper {
    int countByExample(LzLitchiTypeExample example);

    int deleteByExample(LzLitchiTypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LzLitchiType record);

    int insertSelective(LzLitchiType record);

    List<LzLitchiType> selectByExample(LzLitchiTypeExample example);

    LzLitchiType selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LzLitchiType record, @Param("example") LzLitchiTypeExample example);

    int updateByExample(@Param("record") LzLitchiType record, @Param("example") LzLitchiTypeExample example);

    int updateByPrimaryKeySelective(LzLitchiType record);

    int updateByPrimaryKey(LzLitchiType record);
}