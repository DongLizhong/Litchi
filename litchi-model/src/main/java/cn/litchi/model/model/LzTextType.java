package cn.litchi.model.model;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class LzTextType implements Serializable {
    private Long id;

    private String parentId;

    private String name;

    private Long createTime;

    private Long updateTime;
}