package cn.litchi.model.model;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class LzNodeType implements Serializable{
    private Long id;

    private String type;

    private Long createTime;

    private Long updateTime;
}