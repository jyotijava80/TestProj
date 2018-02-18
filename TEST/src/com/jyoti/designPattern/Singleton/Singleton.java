package com.jyoti.designPattern.Singleton;

public class Singleton {
	
	private static Singleton singletonInstance = new Singleton();
	
	private Singleton()
	{}
	
	public static Singleton getInstance()
	{
		return singletonInstance;
		
	}
	
	public void showMessage()
	{
		
		System.out.println("hello Singleton");
	}

}
