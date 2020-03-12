package cn.litchi.model.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@Builder
@TableName(value = "tb_item_param_item")
public class DBTbItemParamItem implements Serializable{
    @TableId(value = "id",type = IdType.AUTO)
    private Long id;

    private Long itemId;

    private Long createTime;

    private Long updateTime;

    private String paramData;
}