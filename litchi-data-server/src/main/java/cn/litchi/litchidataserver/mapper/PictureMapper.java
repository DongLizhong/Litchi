package cn.litchi.litchidataserver.mapper;

import cn.litchi.model.entity.Picture;
import cn.litchi.model.entity.PictureExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PictureMapper {
    int countByExample(PictureExample example);

    int deleteByExample(PictureExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Picture record);

    int insertSelective(Picture record);

    List<Picture> selectByExample(PictureExample example);

    Picture selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Picture record, @Param("example") PictureExample example);

    int updateByExample(@Param("record") Picture record, @Param("example") PictureExample example);

    int updateByPrimaryKeySelective(Picture record);

    int updateByPrimaryKey(Picture record);
}