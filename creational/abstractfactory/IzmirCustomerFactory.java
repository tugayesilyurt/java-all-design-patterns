package com.creational.abstractfactory;

public class IzmirCustomerFactory {
	
	public static Customer getCustomer(CustomerType type) {
		switch (type) {
		case INDIVIDUAL:
			return new IndividualCustomer(Location.IZMIR);
		case CORPORATE:
			return new CorporateCustomer(Location.IZMIR);
		default:
			throw new UnsupportedOperationException();
		}
	}
}
