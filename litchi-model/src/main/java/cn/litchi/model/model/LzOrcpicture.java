package cn.litchi.model.model;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class LzOrcpicture implements Serializable {
    private Long id;

    private Long orchardId;

    private String picture;

    private Long createTime;

    private Long updateTime;
}