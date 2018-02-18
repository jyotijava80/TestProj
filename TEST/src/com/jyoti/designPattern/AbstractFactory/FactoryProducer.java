package com.jyoti.designPattern.AbstractFactory;

public class FactoryProducer {
	
	public AbstractFactory getFactory(String factory)
	
	{
		if(factory.equalsIgnoreCase("Shape"))
		{
		return new ShapeFactory();
		}
		else if(factory.equalsIgnoreCase("Color"))
		{
			return new ColorFactory();
		}
		else  return null;
	}

}
