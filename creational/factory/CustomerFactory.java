package com.creational.factory;

public class CustomerFactory {
	
	public static Customer getInstance(CustomerType type) {
		switch (type) {
		case INDIVIDUAL:
			return new IndividualCustomer();
		case CORPORATE:
			return new CorporateCustomer();
		default:
			throw new UnsupportedOperationException();
		}
	}

	public enum CustomerType {
		INDIVIDUAL, CORPORATE;
	}
}
