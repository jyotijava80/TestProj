package com.jyoti.designPattern.State;

public class StartState implements State {

	@Override
	public void doAction(Context context) {
		// TODO Auto-generated method stub
		
		System.out.println("In the start State");
		context.setState(this);

	}
	@Override
	public String toString() {
		return "[Start State]";
	}

		
}
