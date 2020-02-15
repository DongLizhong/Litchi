package cn.litchi.model.model;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@Builder
public class TbItemParamItem implements Serializable{
    private Long id;

    private Long itemId;

    private Long createTime;

    private Long updateTime;

    private String paramData;
}