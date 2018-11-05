package com.zhandev.prototype;

import java.util.Hashtable;

public class ShapeCache {

	// Hashtable is synchronized, whereas HashMap is not
	private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

	// assume that each shape needs to run database query to be created
	public static void loadCache() {
		Rectangle rectangle = new Rectangle();
		rectangle.setId("1");
		shapeMap.put(rectangle.getId(), rectangle);
		
		Square square = new Square();
		square.setId("2");
		shapeMap.put(square.getId(), square);
	}
	
	public static Shape getShape(String shapeId) {
		Shape cachedShape = shapeMap.get(shapeId);
		// regard Shape obj in shapeMap as a prototype 
		// so return a clone of the Shape obj instead of itself
		return (Shape) cachedShape.clone();
	}
	
}
