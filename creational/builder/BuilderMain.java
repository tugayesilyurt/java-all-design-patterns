package com.creational.builder;

public class BuilderMain {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.setName("tugay");
		customer.setSurname("yesilyurt");
		customer.setAge(31);

		Customer customer2 = new Customer.Builder().name("tugay").surname("yesilyurt").age(31).build();

		System.out.println(customer);
		System.out.println(customer2);

	}

}
