package com.zhandev.bridge;


public class BridgePatternDemo {

	public static void main(String[] args) {
		Shape rectangle = new Rectangle(new RedColor());
		rectangle.applyColor();
		
		Shape square = new Square(new GreenColor());
		square.applyColor();
	}
}
