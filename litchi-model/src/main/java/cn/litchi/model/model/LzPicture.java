package cn.litchi.model.model;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class LzPicture {
    private Long id;

    private Long nodeId;

    private Long mId;

    private Long hId;

    private Long lId;

    private Date time;

    private String volt;

    private String picture;

    private Integer num;

    private Integer youngNum;

    private Integer immatureNum;

    private Integer matureNum;

    private Long createTime;

    private Long updateTime;
}