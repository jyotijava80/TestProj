package com.jyoti.designPattern.FlyWeight;

public class Circle implements Shape {
	
	private int x;
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public void setColor(String color) {
		this.color = color;
	}

	private int y;
	private int radius;
	private String color;

	public Circle(String color) {
		super();
		this.color = color;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		 System.out.println("Circle: Draw() [Color : " + color + ", x : " + x + ", y :" + y + ", radius :" + radius);
		 

	}

}
