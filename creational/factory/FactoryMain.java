package com.creational.factory;

import com.creational.factory.CustomerFactory.CustomerType;

public class FactoryMain {
	public static void main(String[] args) {
        System.out.println(CustomerFactory.getInstance(CustomerType.INDIVIDUAL));
        System.out.println(CustomerFactory.getInstance(CustomerType.CORPORATE));
    }
}
