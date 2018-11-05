package com.zhandev.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

	private int state; 
	private List<Observer> observers = new ArrayList<Observer>();
	
	public int getState() {
		return state;
	}
	
	public void setState(int state) {
		this.state = state;
		notifyAllObservers();
	}

	private void notifyAllObservers() {
		observers.forEach(Observer::update);
	}
	
	public void attachObserver(Observer observer) {
		observers.add(observer);
	}
	
	public void detachObserver(Observer observer) {
		observers.remove(observer);
	}
}
