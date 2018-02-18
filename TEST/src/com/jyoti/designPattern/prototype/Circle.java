package com.jyoti.designPattern.prototype;

public class Circle extends Shape {
	
	public Circle()
	{
		type = "Rectangle";
	}

	@Override
	void draw() {
		// TODO Auto-generated method stub
		
		System.out.println("Inside draw method of Circle");
		
	}

	
	
	
}
