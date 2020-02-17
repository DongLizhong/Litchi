package cn.litchi.model.model;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class LzText implements Serializable {
    public static final String ID_FIELD = "id";
    public static final String TEXT_TYPE_ID_FIELD = "text_type_id";
    public static final String TITLE_FIELD = "title";
    public static final String MESSAGE_FIELD = "message";
    public static final String PICTURE_FIELD = "picture";
    public static final String CREATE_TIME_FIELD = "create_time";
    public static final String UPDATE_TIME_FIELD = "update_time";

    private Long id;

    private Long textTypeId;

    private String title;

    private String message;

    private String picture;

    private Long createTime;

    private Long updateTime;
}