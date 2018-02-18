package com.jyoti.designPattern.Decorator;

public class DecoratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Shape rectangle = new Rectangle();
		rectangle.draw();
		
		Shape redRectangle = new RedShapeDecorator(rectangle);
		redRectangle.draw();
		
		Shape redCircle = new RedShapeDecorator(new Circle());
		redCircle.draw();
		
		
		
	}

}
