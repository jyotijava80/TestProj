package com.jyoti.designPattern.FlyWeight;

import java.util.HashMap;

public class ShapeFactory {
	
	
	private static final HashMap<String,Circle> circleMap = new HashMap<String,Circle>();
	
	public static Shape getCircle(String color)
	{
		Circle circle = (Circle)circleMap.get(color);
		
		if(circle==null)
		{
			
			circle = new Circle(color);
			circleMap.put(color, circle);
			System.out.println("creating Circle of color-->"+color);
		}
			
			
		
		return circle;
		
	}
	
	
	
	

}
