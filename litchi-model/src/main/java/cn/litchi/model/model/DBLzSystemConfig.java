package cn.litchi.model.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "lz_system_config")
public class DBLzSystemConfig {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    private String key;
    private String value;
}
