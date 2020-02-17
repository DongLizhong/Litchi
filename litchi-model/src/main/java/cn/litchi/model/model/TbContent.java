package cn.litchi.model.model;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class TbContent {
    public static final String ID_FIELD = "id";
    public static final String CATEGORY_ID_FIELD = "category_id";
    public static final String TITLE_FIELD = "title";
    public static final String SUB_TITLE_FIELD = "sub_title";
    public static final String URL_FIELD = "url";
    public static final String PICTURE_FIELD = "picture";
    public static final String PICTURE_2_FIELD = "picture2";
    public static final String CREATE_TIME_FIELD = "create_time";
    public static final String UPDATE_TIME_FIELD = "update_time";
    public static final String CONTENT_FIELD = "content";

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