package com.zhandev.singleton;

public class SingletonPatternDemo {

	public static void main(String[] args) {
		
		//illegal construct
	    //Compile Time Error: The constructor SingleObject() is not visible
	    //SingleObject object = new SingleObject();
		
		SingleObject singleObject = SingleObject.getInstance();
		singleObject.showMessage();
		
		SingleObject singletonObj1 = SingleObject.getInstance(); 
		SingleObject singletonObj2 = SingleObject.getInstance();
		System.out.println(singletonObj1 == singletonObj2);  // true
		
		
		/*
		 * lazy
		 */
		LazySingleObject LazySingleObject1 = LazySingleObject.getInstance();
		LazySingleObject LazySingleObject2 = LazySingleObject.getInstance();
		System.out.println(LazySingleObject1 == LazySingleObject2);  // true
	}
}
