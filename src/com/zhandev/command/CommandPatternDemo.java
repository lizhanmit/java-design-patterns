package com.zhandev.command;

public class CommandPatternDemo {

	public static void main(String[] args) {
		Stock stockA = new Stock("stockA", 10);
		
		BuyStock buyStockOrder = new BuyStock(stockA);
		SellStock sellStockOrder = new SellStock(stockA);
		
		Broker broker = new Broker();
		broker.addOrder(buyStockOrder);
		broker.addOrder(sellStockOrder);
		
		broker.executeOrders();
	}
}
