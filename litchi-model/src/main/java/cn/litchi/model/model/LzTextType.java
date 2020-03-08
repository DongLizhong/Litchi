package cn.litchi.model.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
@TableName(value = "lz_text_type")
public class LzTextType implements Serializable {
    @TableId(value = "id",type = IdType.AUTO)
    private Long id;

    private String parentId;

    private String name;

    private Long createTime;

    private Long updateTime;
}