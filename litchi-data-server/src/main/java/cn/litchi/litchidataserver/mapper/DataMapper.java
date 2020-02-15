package cn.litchi.litchidataserver.mapper;

import cn.litchi.model.entity.Data;
import cn.litchi.model.entity.DataExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DataMapper {
    int countByExample(DataExample example);

    int deleteByExample(DataExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Data record);

    int insertSelective(Data record);

    List<Data> selectByExample(DataExample example);

    Data selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Data record, @Param("example") DataExample example);

    int updateByExample(@Param("record") Data record, @Param("example") DataExample example);

    int updateByPrimaryKeySelective(Data record);

    int updateByPrimaryKey(Data record);
}