package com.zhandev.singleton;

/*
 * synchronized lazy implementation 
 * not good
 */
public class LazySingleObject {

	private static LazySingleObject lazyInstance = new LazySingleObject();
	
	private LazySingleObject() {
		
	}
	
	public static LazySingleObject getInstance() {
		// synchronized is used to ensure this is thread-safe
		synchronized (LazySingleObject.class) {
			if (lazyInstance == null) {
				lazyInstance = new LazySingleObject();
			}
		}
		
		return lazyInstance;
	}
}
