package com.structural.adapter;

public class Charger {

	private String city;

	private Adapter adapter;

	public void charge() {
		adapter.conntect();
		System.out.println("Charging...");
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setAdapter(Adapter adapter) {
		this.adapter = adapter;
	}

}