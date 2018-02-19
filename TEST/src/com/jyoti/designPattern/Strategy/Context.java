package com.jyoti.designPattern.Strategy;

public class Context {
	
	private Strategy strategy;

	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}
	
	
	public int execute(int a, int b)
	{
		
		return strategy.doOperation(a, b);
		
	}
	

}
