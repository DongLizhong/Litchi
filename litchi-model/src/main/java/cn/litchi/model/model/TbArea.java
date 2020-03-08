package cn.litchi.model.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
@TableName(value = "tb_area")
public class TbArea implements Serializable{
    @TableId(value = "id",type = IdType.AUTO)
    private Long id;

    private Long parentId;

    private String area;

    private Long createTime;

    private Long updateTime;
}