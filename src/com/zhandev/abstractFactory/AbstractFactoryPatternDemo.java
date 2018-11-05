package com.zhandev.abstractFactory;

import com.zhandev.factory.Shape;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {

		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		
		Shape shape1 = shapeFactory.getShape("RECTANGLE");
		shape1.draw();
		
		Shape shape2 = shapeFactory.getShape("SQUARE");
		shape2.draw();
		
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
		
		Color color1 = colorFactory.getColor("RED");
		color1.fill();
		
		Color color2 = colorFactory.getColor("BLUE");
		color2.fill();
	}

}
