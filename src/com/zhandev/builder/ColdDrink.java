package com.zhandev.builder;

public abstract class ColdDrink implements Item {

	@Override
	public abstract String getName();

	@Override
	public Packing getPacking() {
		return new Bottle();
	}

	@Override
	public abstract float getPrice();
}
