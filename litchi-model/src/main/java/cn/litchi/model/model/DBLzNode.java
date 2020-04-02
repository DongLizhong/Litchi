package cn.litchi.model.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.time.Instant;

@Data
@Builder
@ToString
@TableName(value = "lz_node")
@AllArgsConstructor
@NoArgsConstructor
/**
 * 节点
 */
public class DBLzNode implements Serializable{
    @TableId(value = "id",type = IdType.AUTO)
    private Long id;

    private String name;

    private Integer nodeTypeId;

    private Long orchardId;

    private String token;

    private Boolean enable;

    private Instant createTime;

    private Instant updateTime;
}