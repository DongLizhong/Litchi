package cn.litchi.litchidataserver.mapper;

import cn.litchi.model.entity.Node;
import cn.litchi.model.entity.NodeExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface NodeMapper {
    int countByExample(NodeExample example);

    int deleteByExample(NodeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Node record);

    int insertSelective(Node record);

    List<Node> selectByExample(NodeExample example);

    Node selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Node record, @Param("example") NodeExample example);

    int updateByExample(@Param("record") Node record, @Param("example") NodeExample example);

    int updateByPrimaryKeySelective(Node record);

    int updateByPrimaryKey(Node record);
}