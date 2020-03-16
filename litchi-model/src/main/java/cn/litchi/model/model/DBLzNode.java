package cn.litchi.model.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.time.Instant;

@Data
@Builder
@ToString
@TableName(value = "lz_node")
/**
 * 节点
 */
public class DBLzNode implements Serializable{
    @TableId(value = "id",type = IdType.AUTO)
    private Long id;

    private Integer nodeTypeId;

    private Long orchardId;

    private String token;

    private Instant createTime;

    private Instant updateTime;
}