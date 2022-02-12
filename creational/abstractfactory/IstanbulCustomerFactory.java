package com.creational.abstractfactory;

public class IstanbulCustomerFactory {
	
	public static Customer getCustomer(CustomerType type) {
		switch (type) {
		case INDIVIDUAL:
			return new IndividualCustomer(Location.ISTANBUL);
		case CORPORATE:
			return new CorporateCustomer(Location.ISTANBUL);
		default:
			throw new UnsupportedOperationException();
		}
	}
}
