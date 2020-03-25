package cn.litchi.model.model;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
public class DBTbCart implements Serializable {
    private Long userId;
    private List<Long> cartItemIds = new ArrayList<>();
}
