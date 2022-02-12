package com.structural.proxy;

public class RealObjectImpl implements RealObject {
	 
    @Override
    public void doSomething() {
        System.out.println("Real Object");
    }
 
}