package com.zhandev.observer;

public class ObserverPatternDemo {

	public static void main(String[] args) {
		Subject subject = new Subject();
		
		new BinaryObserver(subject);
		new OctalObserver(subject);
		new HexaObserver(subject);
		
		System.out.println("------ state changes to 10 ------");
		subject.setState(10);
		
		System.out.println("------ state changes to 15 ------");
		subject.setState(15);
	}
}
