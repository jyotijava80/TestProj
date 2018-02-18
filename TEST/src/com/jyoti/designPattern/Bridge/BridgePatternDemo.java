package com.jyoti.designPattern.Bridge;

public class BridgePatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		 Shape GreenCircle = new Circle(100,100,10,new GreenCircle());
		 Shape RedCircle = new Circle(50, 50, 15, new RedCircle());
		 
		 RedCircle.draw();
		 GreenCircle.draw();
	}

}
