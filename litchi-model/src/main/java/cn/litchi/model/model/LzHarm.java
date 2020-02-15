package cn.litchi.model.model;

import cn.litchi.model.respone.model.RespHarm;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class LzHarm implements Serializable {

    public static final String ID_FIELD = "id";
    public static final String TYPE_FIELD = "type";
    public static final String NAME_FIELD = "name";
    public static final String PICTURE_FIELD = "picture";
    public static final String DETAIL_FIELD = "detail";
    public static final String FEATURE_FIELD = "feature";
    public static final String RULE_FIELD = "rule";
    public static final String MESSAGE_FIELD = "message";
    public static final String CREATE_TIME_FIELD = "create_time";
    public static final String UPDATE_TIME_FIELD = "update_time";

    private Long id;

    private String type;

    private String name;

    private String picture;

    private String detail;

    private String feature;

    private String rule;

    private String measure;

    private Long createTime;

    private Long updateTime;

    public RespHarm toResponeModel() {
        return RespHarm.builder()
                .id(this.id)
                .name(this.name)
                .pic(this.picture)
                .build();
    }
}