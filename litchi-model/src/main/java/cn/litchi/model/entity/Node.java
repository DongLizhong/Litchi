package cn.litchi.model.entity;

import java.io.Serializable;

public class Node implements Serializable{
    private Long id;

    private Integer typeId;

    private Long oId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Long getoId() {
        return oId;
    }

    public void setoId(Long oId) {
        this.oId = oId;
    }

    @Override
    public String toString() {
        return "Node{" +
                "id=" + id +
                ", typeId=" + typeId +
                ", oId=" + oId +
                '}';
    }
}