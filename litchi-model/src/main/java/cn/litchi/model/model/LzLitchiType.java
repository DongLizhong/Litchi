package cn.litchi.model.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
@TableName(value = "lz_litchi_type")
/**
 * 荔枝类型
 */
public class LzLitchiType implements Serializable {
    @TableId(value = "id",type = IdType.AUTO)
    private Long id;

    private String type;

    private String jan;

    private String feb;

    private String mar;

    private String apr;

    private String may;

    private String jun;

    private String jul;

    private String aug;

    private String sept;

    private String oct;

    private String nov;

    private String dece;

    private Long createTime;

    private Long updateTime;
}