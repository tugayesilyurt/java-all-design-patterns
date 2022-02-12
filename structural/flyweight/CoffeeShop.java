package com.structural.flyweight;

import java.util.ArrayList;

public class CoffeeShop {
	
	private static final ArrayList<Order> orders = new ArrayList<>();

	public void takeOrder(CoffeeFlavour flavourName, CoffeeLatteArt latteArt, int tableNumber) {
		orders.add(Order.of(flavourName, latteArt, tableNumber));
	}

	public static int getNumberOfOrders() {
		return orders.size();
	}

}