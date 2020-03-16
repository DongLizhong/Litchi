package cn.litchi.model.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.time.Instant;

@Data
@Builder
@TableName(value = "lz_text_type")
public class DBLzTextType implements Serializable {
    @TableId(value = "id",type = IdType.AUTO)
    private Long id;

    private String parentId;

    private String name;

    private Instant createTime;

    private Instant updateTime;
}