package com.zhandev.prototype;

public abstract class Shape implements Cloneable {

	private String id; 
	protected String type;
	
	abstract void draw();
	
	public String getType() {
		return type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public Object clone() {
		Object clonedObj = null;
		
		try {
			clonedObj = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return clonedObj;
	}
	
}
