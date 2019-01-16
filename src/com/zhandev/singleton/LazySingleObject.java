package com.zhandev.singleton;

/*
 * lazy implementation 
 */
public class LazySingleObject {

	private static LazySingleObject lazyInstance = null;
	
	private LazySingleObject() {
		
	}
	
	// NOTE "synchronized" here, you must add it
	// otherwise, it is not thread safe
	// as when multiple threads invoke this method, there will be something wrong, although the result may look right
	// conclusion: do not recommend to write in this way due to performance problem
	public static synchronized LazySingleObject getInstance() {
		if (lazyInstance == null) {
			lazyInstance = new LazySingleObject();
		}
		return lazyInstance;
	}
}
