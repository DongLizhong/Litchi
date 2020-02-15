package cn.litchi.model.entity;

import java.io.Serializable;

public class LzOrcpicture implements Serializable {
    private Long id;

    private Long orcId;

    private String pic;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrcId() {
        return orcId;
    }

    public void setOrcId(Long orcId) {
        this.orcId = orcId;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }
}