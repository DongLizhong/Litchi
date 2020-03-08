package cn.litchi.model.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;

import javax.xml.ws.BindingType;
import java.io.Serializable;
import java.util.Date;

@Data
@Builder
@TableName(value = "tb_item_cat")
public class TbItemCat implements Serializable{
    @TableId(value = "id",type = IdType.AUTO)
    private Long id;

    private Long parentId;

    private String name;

    private Integer status;

    private Integer sortOrder;

    private Boolean isParent;

    private Long createTime;

    private Long updateTime;
}