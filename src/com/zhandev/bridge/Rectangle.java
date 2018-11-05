package com.zhandev.bridge;

// concrete abstraction
public class Rectangle extends Shape {

	public Rectangle(Color color) {
		super(color);
	}

	@Override
	public void applyColor() {
		System.out.print("Rectangle is filled with ");
		color.applyColor();
	}

}
