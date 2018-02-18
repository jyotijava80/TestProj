package com.jyoti.designPattern.Proxy;

public class ProxyImage implements Image {
	public String filename;
	private RealImage realImage;

	public ProxyImage(String filename) {
		super();
		this.filename = filename;
	}

	@Override
	public void display() {
		
		if(realImage == null)
		{
			realImage= new RealImage(filename);
			realImage.display();
			
		}
		// TODO Auto-generated method stub
		

	}

}
