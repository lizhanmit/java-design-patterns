package com.zhandev.singleton;

/**
 * recommended
 */
public class NestedClassSingletonObject {

	private NestedClassSingletonObject() {
		
	}
	
	public static NestedClassSingletonObject getInstance() {
		return Nested.nestedClassSingletonObject;
	}
	
	private static class Nested {
		private static final NestedClassSingletonObject nestedClassSingletonObject = new NestedClassSingletonObject();
	}
	
}
