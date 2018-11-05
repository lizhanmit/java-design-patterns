package com.zhandev.observer;

public class HexaObserver extends Observer {

	public HexaObserver(Subject subject) {
		this.subject = subject;
		this.subject.attachObserver(this);
	}
	
	@Override
	public void update() {
		System.out.println("Hex String: " + Integer.toHexString(subject.getState())); 
	}

}
