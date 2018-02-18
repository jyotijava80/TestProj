package com.jyoti.designPattern.Bridge;

public class Circle extends Shape {
	private int x, y, radius;
	public Circle(int radius,int x, int y,drawAPI dAPI)
	{
		super(dAPI);
		this.x =x;
		this.y =y;
		this.radius = radius;
	
		
	}

	@Override
	public void draw() {
		
		dAPI.drawCircle(radius, x, y);	
		// TODO Auto-generated method stub

	}

}
