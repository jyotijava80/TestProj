package com.jyoti.designPattern.AbstractFactory;

public class ShapeFactory extends AbstractFactory{
	
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

@Override
public Color getColor(String color) {
	// TODO Auto-generated method stub
	return null;
}

}
