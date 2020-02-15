package cn.litchi.model.entity;

import java.io.Serializable;
import java.util.Date;

public class Data implements Serializable{
    private Long id;

    private Long lId;

    private Long nId;

    private Date time;

    private String temp;

    private String humi;

    private String lx;

    private String tlx;

    private String water;

    private String co2;

    private Byte windDirection;

    private String windStrength;

    private String rainfall;

    private String volt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getlId() {
        return lId;
    }

    public void setlId(Long lId) {
        this.lId = lId;
    }

    public Long getnId() {
        return nId;
    }

    public void setnId(Long nId) {
        this.nId = nId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp == null ? null : temp.trim();
    }

    public String getHumi() {
        return humi;
    }

    public void setHumi(String humi) {
        this.humi = humi == null ? null : humi.trim();
    }

    public String getLx() {
        return lx;
    }

    public void setLx(String lx) {
        this.lx = lx == null ? null : lx.trim();
    }

    public String getTlx() {
        return tlx;
    }

    public void setTlx(String tlx) {
        this.tlx = tlx == null ? null : tlx.trim();
    }

    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water == null ? null : water.trim();
    }

    public String getCo2() {
        return co2;
    }

    public void setCo2(String co2) {
        this.co2 = co2 == null ? null : co2.trim();
    }

    public Byte getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(Byte windDirection) {
        this.windDirection = windDirection;
    }

    public String getWindStrength() {
        return windStrength;
    }

    public void setWindStrength(String windStrength) {
        this.windStrength = windStrength == null ? null : windStrength.trim();
    }

    public String getRainfall() {
        return rainfall;
    }

    public void setRainfall(String rainfall) {
        this.rainfall = rainfall == null ? null : rainfall.trim();
    }

    public String getVolt() {
        return volt;
    }

    public void setVolt(String volt) {
        this.volt = volt == null ? null : volt.trim();
    }
}