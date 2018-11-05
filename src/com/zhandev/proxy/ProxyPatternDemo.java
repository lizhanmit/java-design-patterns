package com.zhandev.proxy;

public class ProxyPatternDemo {

	public static void main(String[] args) {
		Image image = new ProxyImage("test_image_name.jpg"); 
		
		System.out.println("------ 1st display ------");
		// image will be loaded from disk as it is the first time
		image.display();
		
		System.out.println("------ 2nd display ------");
		// image will not be loaded from disk again, just display straight away
		image.display();
	}
}
