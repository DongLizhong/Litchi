package cn.litchi.model.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@TableName(value = "lz_monitor_regulation_group",resultMap = "groupResultMap")
public class DBLzMonitorRegulationGroup implements Serializable {
    public static final String ID_FIELD = "id";

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    private Long orchardId;
    private Boolean enable;
    private String message;
    private LocalDate beginDate;
    private LocalDate endDate;
    private Long createTime;
    private Long updateTime;
    @TableField(exist = false)
    private List<DBLzMonitorRegulationItem> items;
}
