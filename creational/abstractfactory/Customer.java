package com.creational.abstractfactory;

public abstract class Customer {

	public Customer(CustomerType type, Location location) {
		this.type = type;
		this.location = location;
	}

	protected abstract void construct(Location location);

	private CustomerType type = null;
	private Location location = null;

}
