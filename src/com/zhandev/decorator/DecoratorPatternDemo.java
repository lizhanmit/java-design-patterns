package com.zhandev.decorator;

public class DecoratorPatternDemo {

	public static void main(String[] args) {
		
		Shape rectangle = new Rectangle();
		rectangle.draw();
		
		Shape redRectangle = new RedShapeDecorator(rectangle);
		redRectangle.draw();
		
		Shape square = new Square();
		square.draw();
		
		Shape redSquare = new RedShapeDecorator(square);
		redSquare.draw();
		
		
	}
}
