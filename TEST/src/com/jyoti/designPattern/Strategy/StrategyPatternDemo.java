package com.jyoti.designPattern.Strategy;

public class StrategyPatternDemo {
	
	
	
	
	public static void main(String args[])
	{
		Context cont_add = new Context(new AddOperation());
		Context cont_sub = new Context(new SubtractOperation());
		Context cont_multi = new Context(new MultiplyOperation());
		
		System.out.println(" Addition of 3 and 4  : " +cont_add.execute(3, 4));
		System.out.println(" Subtraction of 8 and 4  : " +cont_sub.execute(8, 4));
		System.out.println(" Multiplication  of 4 and 5  : " +cont_multi.execute(4, 5));
		
	}

}
