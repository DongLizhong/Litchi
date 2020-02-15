package cn.litchi.model.model;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class TbOrderItem implements Serializable{
    private String id;

    private String itemId;

    private String orderId;

    private Integer num;

    private String title;

    private Long price;

    private Long totalFee;

    private String picPath;

    private Long createTime;

    private Long updateTime;
}