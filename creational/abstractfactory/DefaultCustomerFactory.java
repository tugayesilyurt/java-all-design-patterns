package com.creational.abstractfactory;

public class DefaultCustomerFactory {
	
	public static Customer getCustomer(CustomerType type) {
		switch (type) {
		case INDIVIDUAL:
			return new IndividualCustomer(Location.DEFAULT);
		case CORPORATE:
			return new CorporateCustomer(Location.DEFAULT);
		default:
			throw new UnsupportedOperationException();
		}
	}
}
