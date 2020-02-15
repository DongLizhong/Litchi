package cn.litchi.model.model;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@Builder
public class TbItemCat implements Serializable{
    private Long id;

    private Long parentId;

    private String name;

    private Integer status;

    private Integer sortOrder;

    private Boolean isParent;

    private Long createTime;

    private Long updateTime;
}