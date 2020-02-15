package cn.litchi.model.model;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class TbContentCategory {
    private Long id;

    private Long parentId;

    private String name;

    private Integer status;

    private Integer sortOrder;

    private Boolean isParent;

    private Long createTime;

    private Long updateTime;
}