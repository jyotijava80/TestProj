package com.jyoti.designPattern.AbstractFactory;

public class AbstractFactoryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FactoryProducer fp1 = new FactoryProducer();
		AbstractFactory cf1 = fp1.getFactory("Shape");
		
		FactoryProducer fp2 = new FactoryProducer();
		AbstractFactory cf2 = fp2.getFactory("Color");
		
		
		cf1.getShape("RECTANGLE").draw();
		cf1.getShape("SQUARE").draw();
		cf1.getShape("CIRCLE").draw();
		
		
		
		cf2.getColor("RED").fill();
		cf2.getColor("BLUE").fill();
		cf2.getColor("GREEN").fill();
	
		
		

	}

}
