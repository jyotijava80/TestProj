package com.jyoti.designPattern.NullObject;

public class NullCustomer extends AbstractCustomer {

	@Override
	public boolean isNil() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Not available in customer database" ;
	}

}
