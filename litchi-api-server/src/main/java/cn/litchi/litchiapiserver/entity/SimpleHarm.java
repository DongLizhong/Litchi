package cn.litchi.litchiapiserver.entity;

import java.io.Serializable;

public class SimpleHarm implements Serializable{
	private Long id;
	private String name;
	private String pic;
	
	
	public SimpleHarm() {
		super();
	}
	public SimpleHarm(Long id, String pic, String name) {
		super();
		this.id = id;
		this.pic = pic;
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
