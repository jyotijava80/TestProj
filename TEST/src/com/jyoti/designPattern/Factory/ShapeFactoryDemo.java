package com.jyoti.designPattern.Factory;

public class ShapeFactoryDemo {
	
	public static void main(String args[])
	{
		
		Shape sf1 = new ShapeFactory().getShape("CIRCLE");
		sf1.draw();
		Shape sf2 = new ShapeFactory().getShape("SQUARE");
		sf2.draw();
		Shape sf3 = new ShapeFactory().getShape("RECTANGLE");
		sf3.draw();
		
	}

}
