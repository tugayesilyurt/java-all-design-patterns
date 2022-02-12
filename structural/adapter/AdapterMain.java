package com.structural.adapter;

public class AdapterMain {
	public static void main(String[] args) {

		Charger charger = new Charger();

		charger.setAdapter(new IzmirAdapter());

		charger.charge();

		charger.setAdapter(new IstanbulAdapter());

		charger.charge();

	}
}
