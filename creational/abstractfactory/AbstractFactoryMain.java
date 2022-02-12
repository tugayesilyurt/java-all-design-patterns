package com.creational.abstractfactory;

public class AbstractFactoryMain {
	public static void main(String[] args) {
        System.out.println(CustomerFactory.buildCustomer(CustomerType.INDIVIDUAL));
        System.out.println(CustomerFactory.buildCustomer(CustomerType.CORPORATE));
    }
}
