package cn.litchi.model.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@Builder
@ToString
@TableName(value = "lz_node")
/**
 * 节点
 */
public class LzNode implements Serializable{
    @TableId(value = "id",type = IdType.AUTO)
    private Long id;

    private Integer nodeTypeId;

    private Long orchardId;

    private Long createTime;

    private Long updateTime;
}