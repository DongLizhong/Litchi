package cn.litchi.litchiapiserver.entity;

import java.io.Serializable;

public class Picture implements Serializable{
	private String title;
	private String pic;
	private String url;
	
	
	public Picture() {
		super();
	}
	public Picture(String title, String pic, String url) {
		super();
		this.title = title;
		this.pic = pic;
		this.url = url;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	

}
