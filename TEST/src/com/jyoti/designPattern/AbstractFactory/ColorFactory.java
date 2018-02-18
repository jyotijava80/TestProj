package com.jyoti.designPattern.AbstractFactory;

public class ColorFactory extends AbstractFactory{

	@Override
	public Color getColor(String color) {
		 
		 if(color.equalsIgnoreCase("RED"))
		 {
			 return new Red();
		 }
		 else if(color.equalsIgnoreCase("GREEN"))
		 {
			 return new Green();
		 }
		 
		 else  if(color.equalsIgnoreCase("BLUE"))
		 {
			 return new Blue();
		 }
		 
		 else return null;
		 
	}

	@Override
	public Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
