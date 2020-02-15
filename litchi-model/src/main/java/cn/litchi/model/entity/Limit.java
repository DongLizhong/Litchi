package cn.litchi.model.entity;

import java.io.Serializable;

public class Limit implements Serializable{
    private Long id;

    private String stage;

    private String tu;

    private String td;

    private String hu;

    private String hd;

    private String lu;

    private String ld;

    private String wu;

    private String wd;

    private String vd;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage == null ? null : stage.trim();
    }

    public String getTu() {
        return tu;
    }

    public void setTu(String tu) {
        this.tu = tu == null ? null : tu.trim();
    }

    public String getTd() {
        return td;
    }

    public void setTd(String td) {
        this.td = td == null ? null : td.trim();
    }

    public String getHu() {
        return hu;
    }

    public void setHu(String hu) {
        this.hu = hu == null ? null : hu.trim();
    }

    public String getHd() {
        return hd;
    }

    public void setHd(String hd) {
        this.hd = hd == null ? null : hd.trim();
    }

    public String getLu() {
        return lu;
    }

    public void setLu(String lu) {
        this.lu = lu == null ? null : lu.trim();
    }

    public String getLd() {
        return ld;
    }

    public void setLd(String ld) {
        this.ld = ld == null ? null : ld.trim();
    }

    public String getWu() {
        return wu;
    }

    public void setWu(String wu) {
        this.wu = wu == null ? null : wu.trim();
    }

    public String getWd() {
        return wd;
    }

    public void setWd(String wd) {
        this.wd = wd == null ? null : wd.trim();
    }

    public String getVd() {
        return vd;
    }

    public void setVd(String vd) {
        this.vd = vd == null ? null : vd.trim();
    }
}