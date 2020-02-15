package cn.litchi.litchisourceserver.mapper;

import cn.litchi.model.entity.LzLitchi;
import cn.litchi.model.entity.LzLitchiExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface LzLitchiMapper {
    int countByExample(LzLitchiExample example);

    int deleteByExample(LzLitchiExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LzLitchi record);

    int insertSelective(LzLitchi record);

    List<LzLitchi> selectByExample(LzLitchiExample example);

    LzLitchi selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LzLitchi record, @Param("example") LzLitchiExample example);

    int updateByExample(@Param("record") LzLitchi record, @Param("example") LzLitchiExample example);

    int updateByPrimaryKeySelective(LzLitchi record);

    int updateByPrimaryKey(LzLitchi record);
}