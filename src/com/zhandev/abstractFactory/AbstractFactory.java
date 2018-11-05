package com.zhandev.abstractFactory;

import com.zhandev.factory.Shape;

public abstract class AbstractFactory {

	abstract Shape getShape(String shapeType);
	abstract Color getColor(String colorType);
}
