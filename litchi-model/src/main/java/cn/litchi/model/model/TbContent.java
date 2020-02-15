package cn.litchi.model.model;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class TbContent {
    private Long id;

    private Long categoryId;

    private String title;

    private String subTitle;

    private String titleDesc;

    private String url;

    private String picture;

    private String picture2;

    private Long createTime;

    private Long updateTime;

    private String content;
}