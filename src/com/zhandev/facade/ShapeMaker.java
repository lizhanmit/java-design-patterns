package com.zhandev.facade;

// facade class as an interface hiding the complexities of the existing system
public class ShapeMaker {

	private Shape rectangle;
	private Shape square;
	private Shape circle;
	
	public ShapeMaker() {
		rectangle = new Rectangle();
		square = new Square();
		circle = new Circle();
	}
	
	// provide methods wrapping methods of those classes in the system
	public void drawRectangle() {
		rectangle.draw();
	}
	
	public void drawSquare() {
		square.draw();
	}
	
	public void drawCircle() {
		circle.draw();
	}
}
