package cn.litchi.model.model;

import cn.litchi.model.respone.model.RespHarm;
import cn.litchi.model.respone.model.RespNodeData;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@lombok.Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "lz_node_data")
/**
 * 节点数据
 */
public class LzNodeData implements Serializable{

    public static final String ID_FIELD = "id";
    public static final String LIMIT_ID_FIELD = "limit_id";
    public static final String NODE_ID_FIELD = "node_id";
    public static final String TIME_FIELD = "time";
    public static final String TEMP_FIELD = "temp";
    public static final String HUMI_FIELD = "humi";
    public static final String LX_FIELD = "lx";
    public static final String TLX_FIELD = "tlx";
    public static final String WATER_FIELD = "water";
    public static final String CO2_FIELD = "co2";
    public static final String WIND_DIRECTION_FIELD = "wind_direction";
    public static final String WIND_STRENGTH_FIELD = "wind_Strength";
    public static final String RAIN_FALL_FIELD = "rainfall";
    public static final String VOLT_FIELD = "volt";

    @TableId(value = "id",type = IdType.AUTO)
    private Long id;

    private Long limitId;

    private Long nodeId;

    private Long time;

    private Long temp;

    private Long humi;

    private Long lx;

    private Long tlx;

    private Long water;

    private Long co2;

    private Byte windDirection;

    private Long windStrength;

    private Long rainfall;

    private Long volt;
}