package cn.litchi.model.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "sys_role")
public class DBSysRole {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    private String name;
}
