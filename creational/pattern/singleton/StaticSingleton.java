package com.creational.pattern.singleton;

public class StaticSingleton {
	
	private static StaticSingleton staticSingleton;
	
	static {
		staticSingleton = new StaticSingleton();
	}
	
	private StaticSingleton() {}
	
	public static StaticSingleton getInstance() {
		return staticSingleton;
	}

	public void singletonRun(){
        System.out.println("Static Singleton Pattern");
    }
}
