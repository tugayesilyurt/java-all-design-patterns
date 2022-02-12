package com.structural.proxy;

public class RealObjectProxy extends RealObjectImpl 
{
    @Override
    public void doSomething() 
    {
        System.out.println("Proxy Object");
        super.doSomething();
    }
}