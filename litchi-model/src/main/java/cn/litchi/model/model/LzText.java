package cn.litchi.model.model;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class LzText implements Serializable {
    private Long id;

    private Long textTypeId;

    private String title;

    private String message;

    private String picture;

    private Long createTime;

    private Long updateTime;
}