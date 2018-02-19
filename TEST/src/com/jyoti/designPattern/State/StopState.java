package com.jyoti.designPattern.State;

public class StopState implements State {

	@Override
	public void doAction(Context context) {
		// TODO Auto-generated method stub
		
		System.out.println("In the stop State");
		context.setState(this);
		
		

	}

	@Override
	public String toString() {
		return "[Stop State]";
	}

		
}
