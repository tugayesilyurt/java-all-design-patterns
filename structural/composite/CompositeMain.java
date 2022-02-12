package com.structural.composite;

public class CompositeMain {

	public static void main(String[] args) {

		Child pamir = new Child("Pamir", "Yesilyurt");
		Parent tugay = new Parent("Tugay", "Yesilyurt");
		Parent gokce = new Parent("Gokce", "Yesilyurt");

		pamir.addParent(tugay);
		pamir.addParent(gokce);
		tugay.addChild(pamir);
		gokce.addChild(pamir);

		GrandParent perihan = new GrandParent("Perihan", "Yesilyurt");

		perihan.addChild(tugay);
		tugay.addParent(perihan);

		perihan.print();
		tugay.print();
		gokce.print();
		pamir.print();
	}

}
