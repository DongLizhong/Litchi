package cn.litchi.litchidataserver.mapper;

import cn.litchi.model.entity.Orchard;
import cn.litchi.model.entity.OrchardExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OrchardMapper {
    int countByExample(OrchardExample example);

    int deleteByExample(OrchardExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Orchard record);

    int insertSelective(Orchard record);

    List<Orchard> selectByExample(OrchardExample example);

    Orchard selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Orchard record, @Param("example") OrchardExample example);

    int updateByExample(@Param("record") Orchard record, @Param("example") OrchardExample example);

    int updateByPrimaryKeySelective(Orchard record);

    int updateByPrimaryKey(Orchard record);
}