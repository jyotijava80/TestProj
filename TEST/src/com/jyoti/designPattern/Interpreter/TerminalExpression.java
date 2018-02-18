package com.jyoti.designPattern.Interpreter;

public class TerminalExpression implements Expression {

	
	 private String data;
	 
	public TerminalExpression(String data) {
		super();
		this.data = data;
	}

	@Override
	public boolean interpret(String context) {
		// TODO Auto-generated method stub
		return context.contains(data);

	}

}
