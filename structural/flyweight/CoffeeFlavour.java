package com.structural.flyweight;

public enum CoffeeFlavour {

	CAPPUCCINO("Cappuccino"), ESPRESSO("Espresso"), FRAPPUCCINO("Frappuccino"), AFFOGATO("Affogato"), LATTE("Latte");

	private String name;

	CoffeeFlavour(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}