package com.zhandev.singleton;

/**
 * recommended
 */
public class NestedClassSingletonObject {

	private NestedClassSingletonObject() {
		
	}
	
	private static class Nested {
		private static NestedClassSingletonObject nestedClassSingletonObject;
		static {
			nestedClassSingletonObject = new NestedClassSingletonObject();
		}
	}
	
	public NestedClassSingletonObject getInstance() {
		return Nested.nestedClassSingletonObject;
	}
}
