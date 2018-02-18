package com.jyoti.designPattern.Command;

public class Stock {
	
	private int qnt =10;
	private int price = 50;
	
	public void buy()
	{
		
		System.out.println("buying stock with quantity-->"+ qnt+ "[price-->"+price+"]");
	}
	
	public void sell()
	{
		System.out.println("selling stock with quantity-->"+ qnt+ "[price-->"+price+"]");
	}

}
