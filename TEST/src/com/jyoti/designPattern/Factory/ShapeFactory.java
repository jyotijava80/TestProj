package com.jyoti.designPattern.Factory;

public class ShapeFactory {
	
 public Shape getShape(String shape)
 {
	 
	 if(shape.equalsIgnoreCase("CIRCLE"))
	 {
		 return new Circle();
	 }
	 else if(shape.equalsIgnoreCase("RECTANGLE"))
	 {
		 return new Rectangle();
	 }
	 
	 else  if(shape.equalsIgnoreCase("SQUARE"))
	 {
		 return new Square();
	 }
	 
	 else return null;
 }

}
