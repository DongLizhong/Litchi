package cn.litchi.model.model;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@Builder
public class TbAdministrator implements Serializable{
    private Long id;

    private String username;

    private String password;

    private String phone;

    private String email;

    private Long createTime;

    private Long updateTime;
}