package com.zhandev.proxy;

public class RealImage implements Image {

	private String fileName;
	
	public RealImage(String fileName) {
		this.fileName = fileName;
		loadFromDisk(fileName);
	}

	// NOTE: this is a private method restricting access from outside of the system
	// it is invoked in constructor when creating an instance of this class 
	// after that, this method will not be invoked anymore while using the instance 
	private void loadFromDisk(String fileName) {
		System.out.println("Loading " + fileName);
	}

	@Override
	public void display() {
		System.out.println("Displaying " + fileName);
	} 
}
