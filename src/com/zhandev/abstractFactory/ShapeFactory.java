package com.zhandev.abstractFactory;

import com.zhandev.factory.Rectangle;
import com.zhandev.factory.Shape;
import com.zhandev.factory.Square;

public class ShapeFactory extends AbstractFactory {

	@Override
	Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}
		if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		
		return null;
	}

	@Override
	Color getColor(String colorType) {
		return null;
	}

}
