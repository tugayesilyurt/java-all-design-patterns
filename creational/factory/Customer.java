package com.creational.factory;

import com.creational.factory.CustomerFactory.CustomerType;

public abstract class Customer {

	public Customer(CustomerType type) {
		this.type = type;
	}

	protected abstract void construct();

	private CustomerType type = null;

	public CustomerType getType() {
		return type;
	}

	public void setType(CustomerType type) {
		this.type = type;
	}
}
