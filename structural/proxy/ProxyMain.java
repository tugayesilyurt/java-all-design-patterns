package com.structural.proxy;

public class ProxyMain {
	public static void main(String[] args) {
		RealObject proxy = new RealObjectProxy();
		proxy.doSomething();
	}
}
