package com.zhandev.abstractFactory;

public class FactoryProducer {

	public static AbstractFactory getFactory(String factoryType) {
		if (factoryType.equalsIgnoreCase("SHAPE")) {
			return new ShapeFactory();
		}
		
		if (factoryType.equalsIgnoreCase("COLOR")) {
			return new ColorFactory();
		}
		
		return null;
	}
}
