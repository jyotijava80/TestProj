package com.jyoti.designPattern.Command;

public class BuyStock implements Order {
	
	private Stock abcstock;

	public BuyStock(Stock abcstock) {
		super();
		this.abcstock = abcstock;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		abcstock.buy();

	}

}
