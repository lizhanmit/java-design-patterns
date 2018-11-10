package com.zhandev.singleton;

/*
 * lazy implementation 
 */
public class LazySingleObject {

	private static LazySingleObject lazyInstance = new LazySingleObject();
	
	private LazySingleObject() {
		
	}
	
	public static synchronized LazySingleObject getInstance() {
		if (lazyInstance == null) {
			lazyInstance = new LazySingleObject();
		}
		return lazyInstance;
	}
}
