package com.zhandev.abstractFactory;

import com.zhandev.factory.Shape;

public class ColorFactory extends AbstractFactory {

	@Override
	Shape getShape(String shapeType) {
		return null;
	}

	@Override
	Color getColor(String colorType) {
		if (colorType == null) {
			return null;
		}

		if (colorType.equalsIgnoreCase("RED")) {
			return new Red();
		}

		if (colorType.equalsIgnoreCase("BLUE")) {
			return new Blue();
		}

		return null;
	}

}
