package com.creational.abstractfactory;

public class IndividualCustomer extends Customer {

	public IndividualCustomer(Location location) {
		super(CustomerType.INDIVIDUAL, location);
		construct(location);
	}

	@Override
	protected void construct(Location location) {
		System.out.println("Builder Individual Customer - location " + location);
	}
}
