package cn.litchi.model.entity;

import java.util.Date;

public class Picture {
    private Long id;

    private Long nId;

    private Long mId;

    private Long hId;

    private Long lId;

    private Date time;

    private String volt;

    private String pic;

    private Integer num;

    private Integer youngNum;

    private Integer immatureNum;

    private Integer matureNum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getnId() {
        return nId;
    }

    public void setnId(Long nId) {
        this.nId = nId;
    }

    public Long getmId() {
        return mId;
    }

    public void setmId(Long mId) {
        this.mId = mId;
    }

    public Long gethId() {
        return hId;
    }

    public void sethId(Long hId) {
        this.hId = hId;
    }

    public Long getlId() {
        return lId;
    }

    public void setlId(Long lId) {
        this.lId = lId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getVolt() {
        return volt;
    }

    public void setVolt(String volt) {
        this.volt = volt == null ? null : volt.trim();
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getYoungNum() {
        return youngNum;
    }

    public void setYoungNum(Integer youngNum) {
        this.youngNum = youngNum;
    }

    public Integer getImmatureNum() {
        return immatureNum;
    }

    public void setImmatureNum(Integer immatureNum) {
        this.immatureNum = immatureNum;
    }

    public Integer getMatureNum() {
        return matureNum;
    }

    public void setMatureNum(Integer matureNum) {
        this.matureNum = matureNum;
    }
}