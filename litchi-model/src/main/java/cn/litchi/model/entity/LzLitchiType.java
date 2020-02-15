package cn.litchi.model.entity;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class LzLitchiType implements Serializable {
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
}