package cn.litchi.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MonitorItemReq {
    public static final int DATE_TYPE = 1;
    public static final int ROLE_NAME = 2;
    public static final int THRESHOLD_TYPE = 3;

    private Long groupId;
    private Integer queryType;
    private String queryKey;
    private Instant beginDate;
    private Instant endDate;
}
