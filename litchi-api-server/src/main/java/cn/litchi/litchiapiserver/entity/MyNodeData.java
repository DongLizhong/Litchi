package cn.litchi.litchiapiserver.entity;

import java.util.Date;

public class MyNodeData {
	private Date time;
	private String data;
	private int line;
	
	public MyNodeData(){}
	
	
	public MyNodeData(Date time, String data, int line) {
		super();
		this.time = time;
		this.data = data;
		this.line = line;
	}


	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public int getLine() {
		return line;
	}
	public void setLine(int line) {
		this.line = line;
	}
	
	

}
