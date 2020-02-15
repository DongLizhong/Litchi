package cn.litchi.litchisourceserver.mapper;

import cn.litchi.model.entity.LzOrcpicture;
import cn.litchi.model.entity.LzOrcpictureExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface LzOrcpictureMapper {
    int countByExample(LzOrcpictureExample example);

    int deleteByExample(LzOrcpictureExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LzOrcpicture record);

    int insertSelective(LzOrcpicture record);

    List<LzOrcpicture> selectByExample(LzOrcpictureExample example);

    LzOrcpicture selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LzOrcpicture record, @Param("example") LzOrcpictureExample example);

    int updateByExample(@Param("record") LzOrcpicture record, @Param("example") LzOrcpictureExample example);

    int updateByPrimaryKeySelective(LzOrcpicture record);

    int updateByPrimaryKey(LzOrcpicture record);
}