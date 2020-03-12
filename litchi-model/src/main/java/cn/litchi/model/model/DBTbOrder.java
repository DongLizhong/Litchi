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
@TableName(value = "tb_order")
public class DBTbOrder implements Serializable{
    @TableId(value = "order_id",type = IdType.AUTO)
    private String orderId;

    private String payment;

    private Integer paymentType;

    private String postFee;

    private Integer status;

    private Long createTime;

    private Long updateTime;

    private Long paymentTime;

    private Long consignTime;

    private Long endTime;

    private Long closeTime;

    private String shippingName;

    private String shippingCode;

    private Long userId;

    private String buyerMessage;

    private String buyerNick;

    private Integer buyerRate;

    private Long vendorId;
}