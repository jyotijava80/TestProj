package com.jyoti.designPattern.Mediator;

public class MediatorPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User jyoti = new User("Jyoti");
		jyoti.sendMessage("hello from Jyoti");
		
		User aarish = new User("Aarish");
		aarish.sendMessage("Hi from Aarish");

	}

}
