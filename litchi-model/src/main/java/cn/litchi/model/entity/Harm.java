package cn.litchi.model.entity;

import java.io.Serializable;

public class Harm implements Serializable{
    private Long id;

    private String type;

    private String name;

    private String pic;

    private String detail;

    private String feature;

    private String rule;

    private String measure;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature == null ? null : feature.trim();
    }

    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule == null ? null : rule.trim();
    }

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure == null ? null : measure.trim();
    }
}