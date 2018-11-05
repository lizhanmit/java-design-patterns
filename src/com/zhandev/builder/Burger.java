package com.zhandev.builder;

public abstract class Burger implements Item {

	@Override
	public abstract String getName();

	@Override
	public Packing getPacking() {
		return new Wrapper();
	}

	@Override
	public abstract float getPrice();

}
