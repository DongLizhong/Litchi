package cn.litchi.model.model;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class TbArea implements Serializable{
    private Long id;

    private Long parentId;

    private String area;

    private Long createTime;

    private Long updateTime;
}