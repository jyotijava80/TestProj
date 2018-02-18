package com.jyoti.designPattern.Decorator;

public abstract class shapeDecorator implements Shape {
	
	protected Shape decoratedShape;

	public shapeDecorator(Shape decoratedShape) {
		super();
		this.decoratedShape = decoratedShape;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		decoratedShape.draw();

	}

}
