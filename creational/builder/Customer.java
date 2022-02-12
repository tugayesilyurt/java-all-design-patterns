package com.creational.builder;

public class Customer {

	private String name, surname;
	private int age;

	public Customer(String name, String surname, int age) {
		this.name = name;
		this.surname = surname;
		this.age = age;
	}

	public Customer() {
	}

	public Customer(Builder builder) {
		this.name = builder.name;
		this.surname = builder.surname;
		this.age = builder.age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static class Builder {

		private String name, surname;
		private int age;

		public Builder() {
		}

		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Builder surname(String surname) {
			this.surname = surname;
			return this;
		}

		public Builder age(int age) {
			this.age = age;
			return this;
		}

		public Customer build() {
			Customer customer = new Customer(this);
			return customer;
		}

	}

}
