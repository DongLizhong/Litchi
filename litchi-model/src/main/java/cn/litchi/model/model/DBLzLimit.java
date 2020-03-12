package cn.litchi.model.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
@TableName(value = "lz_limit")
public class DBLzLimit implements Serializable{
    @TableId(value = "id",type = IdType.AUTO)
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

    private Long createTime;

    private Long updateTime;
}