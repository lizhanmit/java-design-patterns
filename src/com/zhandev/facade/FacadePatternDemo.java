package com.zhandev.facade;

public class FacadePatternDemo {

	public static void main(String[] args) {
		// When creating the instance of the facade class using the constructor, 
		// the client does not need to pass objects as input parameters, 
		// as they have already been created in the constructor.
		ShapeMaker shapeMaker = new ShapeMaker();
		
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
		shapeMaker.drawCircle();
	}
}
