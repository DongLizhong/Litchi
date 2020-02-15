package cn.litchi.litchidataserver.mapper;

import cn.litchi.model.entity.Harm;
import cn.litchi.model.entity.HarmExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface HarmMapper {
    int countByExample(HarmExample example);

    int deleteByExample(HarmExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Harm record);

    int insertSelective(Harm record);

    List<Harm> selectByExample(HarmExample example);

    Harm selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Harm record, @Param("example") HarmExample example);

    int updateByExample(@Param("record") Harm record, @Param("example") HarmExample example);

    int updateByPrimaryKeySelective(Harm record);

    int updateByPrimaryKey(Harm record);
}