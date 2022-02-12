package com.creational.factory;

import com.creational.factory.CustomerFactory.CustomerType;

public class IndividualCustomer extends Customer {
	 
	IndividualCustomer() {
        super(CustomerType.INDIVIDUAL);
        construct();
    }
 
    @Override
    protected void construct() {
        System.out.println("Builder Individual Customer");
    }
}
