package cn.litchi.model.model;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class LzOrchard implements Serializable{
    private Long id;

    private String name;

    private String manager;

    private String phone;

    private String address;

    private Long createTime;

    private Long updateTime;
}