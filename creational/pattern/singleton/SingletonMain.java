package com.creational.pattern.singleton;

public class SingletonMain {
	public static void main(String[] args) {

		ThreadSafeSingleton.getThreadSafeSingleton().singletonRun();

		StaticSingleton.getInstance().singletonRun();

	}
}
