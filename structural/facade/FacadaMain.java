package com.structural.facade;

public class FacadaMain {
	
	public static void main(String[] args) {

		FacadePhone facadePhone = new FacadePhone();

		System.out.println(facadePhone.buildAndroidPhone());
		System.out.println(facadePhone.buildApplePhone());
		System.out.println(facadePhone.buildMicrosoftPhone());

	}
}
