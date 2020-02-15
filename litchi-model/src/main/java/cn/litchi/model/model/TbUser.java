package cn.litchi.model.model;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@Builder
public class TbUser implements Serializable{
    private Long id;

    private String username;

    private String password;

    private String phone;

    private String email;

    private String idcard;

    private Byte status;

    private Long createTime;

    private Long updateTime;
}