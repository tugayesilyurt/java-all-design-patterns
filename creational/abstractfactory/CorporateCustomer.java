package com.creational.abstractfactory;

public class CorporateCustomer extends Customer {

	CorporateCustomer(Location location) {
		super(CustomerType.CORPORATE, location);
		construct(location);
	}

	@Override
	protected void construct(Location location) {
		System.out.println("Builder Corporate Customer - Location " + location);
	}
}
