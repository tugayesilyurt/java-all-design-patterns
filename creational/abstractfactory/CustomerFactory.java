package com.creational.abstractfactory;

public class CustomerFactory {
	private CustomerFactory() {
	}

	public static Customer buildCustomer(CustomerType type) {
		Customer customer = null;
		Location location = Location.IZMIR;
		switch (location) {
		case IZMIR:
			customer = IzmirCustomerFactory.getCustomer(type);
			break;
		case ISTANBUL:
			customer = IstanbulCustomerFactory.getCustomer(type);
			break;
		default:
			customer = DefaultCustomerFactory.getCustomer(type);
		}
		return customer;
	}
}
