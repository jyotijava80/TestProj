package com.jyoti.designPattern.Bridge;

public class GreenCircle implements drawAPI {

	@Override
	public void drawCircle(int radius, int x, int y) {
		// TODO Auto-generated method stub
		
		System.out.println("Drawing Green circle with -->" + "radius-->"+ radius + "x:"+ x+" Y:" + y);

	}

}
