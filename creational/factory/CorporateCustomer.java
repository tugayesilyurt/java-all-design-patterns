package com.creational.factory;

import com.creational.factory.CustomerFactory.CustomerType;

public class CorporateCustomer extends Customer {
	 
	CorporateCustomer() {
        super(CustomerType.CORPORATE);
        construct();
    }
 
    @Override
    protected void construct() {
        System.out.println("Builder Corporate Customer");
    }
}
