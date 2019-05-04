package com.zhandev.singleton;

/*
 * synchronized lazy implementation 
 * not good
 */
public class LazySingleObject {

	private static LazySingleObject lazyInstance = null;
	
	private LazySingleObject() {
		
	}
	
	public static LazySingleObject getInstance() {
		// NOTE "synchronized" here, you must add it
		// otherwise, it is not thread safe
		// as when multiple threads invoke this method, there will be something wrong, although the result may look right
		// conclusion: DO NOT RECOMMEND writing in this way due to performance problem
		synchronized (LazySingleObject.class) {
			if (lazyInstance == null) {
				lazyInstance = new LazySingleObject();
			}
		}
		
		return lazyInstance;
	}
}
