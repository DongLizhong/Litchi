package cn.litchi.model.model;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class LzLimit implements Serializable{
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
}