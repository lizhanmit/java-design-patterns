package com.zhandev.bridge;

//concrete abstraction
public class Square extends Shape {

	public Square(Color color) {
		super(color);
	}

	@Override
	public void applyColor() {
		System.out.print("Square is filled with ");
		color.applyColor();
	}

}
