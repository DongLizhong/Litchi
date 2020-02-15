package cn.litchi.model.model;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class LzLitchi implements Serializable {
    private Long id;

    private Long litchiTypeId;

    private String name;

    private Long createTime;

    private Long updateTime;
}