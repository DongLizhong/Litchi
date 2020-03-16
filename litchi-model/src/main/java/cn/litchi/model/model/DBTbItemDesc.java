package cn.litchi.model.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;

@Data
@Builder
@TableName(value = "tb_item_desc")
public class DBTbItemDesc implements Serializable{
    private Long itemId;

    private Instant createTime;

    private Instant updateTime;

    private String itemDesc;
}