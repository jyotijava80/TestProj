package com.jyoti.designPattern.Bridge;

public abstract class Shape {
	
	drawAPI dAPI;

	public Shape(drawAPI dAPI) {
		this.dAPI = dAPI;
		// TODO Auto-generated constructor stub
	}
	
	 public abstract void draw();
 
}
