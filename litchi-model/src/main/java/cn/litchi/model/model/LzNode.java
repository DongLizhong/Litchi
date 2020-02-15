package cn.litchi.model.model;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@Builder
@ToString
public class LzNode implements Serializable{
    private Long id;

    private Integer typeId;

    private Long orchardId;

    private Long createTime;

    private Long updateTime;
}