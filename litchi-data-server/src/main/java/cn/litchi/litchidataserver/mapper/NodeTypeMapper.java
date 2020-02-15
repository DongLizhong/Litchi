package cn.litchi.litchidataserver.mapper;

import cn.litchi.model.entity.NodeType;
import cn.litchi.model.entity.NodeTypeExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface NodeTypeMapper {
    int countByExample(NodeTypeExample example);

    int deleteByExample(NodeTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NodeType record);

    int insertSelective(NodeType record);

    List<NodeType> selectByExample(NodeTypeExample example);

    NodeType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NodeType record, @Param("example") NodeTypeExample example);

    int updateByExample(@Param("record") NodeType record, @Param("example") NodeTypeExample example);

    int updateByPrimaryKeySelective(NodeType record);

    int updateByPrimaryKey(NodeType record);
}