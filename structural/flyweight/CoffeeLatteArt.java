package com.structural.flyweight;

public enum CoffeeLatteArt {

	DISNEY("Disney"), LITTLE_BUNNY("Little Bunny"), FRENCH("French"), BARISTA_SWAG("Barista Swag"),
	FISHBONE("Fishbone"), MALAYSIAN_BUDDHA("Malaysian Buddha"), CAT("Cat");

	private String name;

	CoffeeLatteArt(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}