package com.behavioural.templatemethod;

public abstract class House {
	
	public final void buildhouse() {
		constructBase();
		constructRoof();
		constructWalls();
		constructWindows();
		constructDoors();
		paintHouse();
		decorateHouse();
	}

	public abstract void decorateHouse();

	public abstract void paintHouse();

	public abstract void constructDoors();

	public abstract void constructWindows();

	public abstract void constructWalls();


	private final void constructRoof() {
		System.out.println("Roof has been constructed.");
	}

	private final void constructBase() {
		System.out.println("Base has been constructed.");
	}
}
