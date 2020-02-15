package cn.litchi.litchidataserver.mapper;

import cn.litchi.model.entity.Limit;
import cn.litchi.model.entity.LimitExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface LimitMapper {
    int countByExample(LimitExample example);

    int deleteByExample(LimitExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Limit record);

    int insertSelective(Limit record);

    List<Limit> selectByExample(LimitExample example);

    Limit selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Limit record, @Param("example") LimitExample example);

    int updateByExample(@Param("record") Limit record, @Param("example") LimitExample example);

    int updateByPrimaryKeySelective(Limit record);

    int updateByPrimaryKey(Limit record);
}