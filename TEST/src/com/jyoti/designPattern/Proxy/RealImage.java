package com.jyoti.designPattern.Proxy;

public class RealImage implements Image {

	
	public RealImage(String filename) {
		super();
		LoadImage(filename);
	}
	

	 public void LoadImage(String filename)
	 {
		System.out.println("Loading image for filename-->"+ filename);
	 }
	 @Override
	public void display() {
		// TODO Auto-generated method stub
		
		System.out.println("Inside Real Image");

	}

}
