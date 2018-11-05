package com.zhandev.observer;

public abstract class Observer {

	// having the object of Subject class as an attribute, 
	// which will make it as the input parameter of the constructor of concrete Observer class, 
	// as a result, when an Observer instance is created, it can be attached to the list of Observer class objects
	protected Subject subject; 
	public abstract void update();
}
