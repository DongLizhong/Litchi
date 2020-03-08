package cn.litchi.model.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@Builder
/**
 * 经销商
 */
@TableName(value = "tb_franchiser")
public class TbFranchiser implements Serializable{
    @TableId(value = "id",type = IdType.AUTO)
    private Long id;

    private String username;

    private String password;

    private String phone;

    private String email;

    private Long createTime;

    private Long updateTime;

    private String idcard;

    private Byte status;
}