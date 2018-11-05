package com.zhandev.mvc;

public class Student {

	private String stdId;
	private String name; 
	
	public String getStdId() {
		return stdId;
	}
	
	public void setStdId(String stdId) {
		this.stdId = stdId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", name=" + name + "]";
	}
}
