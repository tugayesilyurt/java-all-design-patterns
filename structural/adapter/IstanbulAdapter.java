package com.structural.adapter;

public class IstanbulAdapter implements Adapter {

	@Override
	public void conntect() {
		System.out.println("Istanbul Connection");
	}

}