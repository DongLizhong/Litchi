package cn.litchi.model.model;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class LzOrcpicture implements Serializable {
    public static final String ID_FIELD = "id";
    public static final String ORCHARD_ID_FIELD = "orchard_id";
    public static final String PICTURE_FIELD = "picture";
    public static final String CREATE_TIME_FIELD = "create_time";
    public static final String UPDATE_TIME_FIELD = "update_time";

    private Long id;

    private Long orchardId;

    private String picture;

    private Long createTime;

    private Long updateTime;
}