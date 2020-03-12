package cn.litchi.model.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
@TableName(value = "lz_litchi")
/**
 * 荔枝品种
 */
public class DBLzLitchi implements Serializable {
    @TableId(value = "id",type = IdType.AUTO)
    private Long id;

    private Long litchiTypeId;

    private String name;

    private Long createTime;

    private Long updateTime;
}