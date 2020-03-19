package cn.litchi.model.model;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.time.Instant;

@Data
@Builder
@TableName(value = "lz_monitor_regulation_item")
public class DBLzMonitorRegulationItem implements Serializable,Comparable<DBLzMonitorRegulationItem> {
    public static final String GROUP_ID_FIELD = "group_id";

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    private Long groupId;
    private Integer index;
    private String dataType;
    private Double threshold;
    private Long keepMinutes;
    private Boolean enable;
    private Instant createTime;
    private Instant updateTime;


    @Override
    public int compareTo(DBLzMonitorRegulationItem o) {
        return (int) (this.keepMinutes - o.keepMinutes);
    }
}
