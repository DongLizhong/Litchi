package cn.litchi.model.respone.model;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class RespHarm implements Serializable{
	private Long id;
	private String name;
	private String pic;
}
