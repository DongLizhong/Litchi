package cn.litchi.model.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

@Data
@Builder
@TableName(value = "lz_monitor_regulation_group", resultMap = "groupResultMap")
public class DBLzMonitorRegulationGroup implements Serializable, Comparable<DBLzMonitorRegulationGroup> {
    public static final String ID_FIELD = "id";

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    private Long orchardId;
    private Boolean enable;
    private String message;
    private Integer beginDay;
    private Integer endDay;
    private Instant createTime;
    private Instant updateTime;
    @TableField(exist = false)
    private List<DBLzMonitorRegulationItem> items;

    @Override
    public int compareTo(DBLzMonitorRegulationGroup o) {
        return (int) (Collections.max(this.items).getKeepMinutes() - Collections.max(o.items).getKeepMinutes());
    }
}
