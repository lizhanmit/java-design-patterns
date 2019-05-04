package com.zhandev.singleton;

/*
 * non-lazy implementation 
 * not good
 */
public class SingleObject {

	private static SingleObject instance = new SingleObject();
	
	// make the constructor private so that this class cannot be instantiated using new operator 
	private SingleObject() {
		
	}
	
	public static SingleObject getInstance() {
		return instance;
	}
	
	public void showMessage() {
		System.out.println("hello world");
	}
}
