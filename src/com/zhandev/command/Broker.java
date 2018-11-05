package com.zhandev.command;

import java.util.ArrayList;
import java.util.List;

// command executor class
public class Broker {

	private List<Order> orderList = new ArrayList<Order>();
	
	public void addOrder(Order order) {
		orderList.add(order);
	}
	
	public void executeOrders() {
		orderList.forEach(Order::execute);
		orderList.clear();
	}
}
