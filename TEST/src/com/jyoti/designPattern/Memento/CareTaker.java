package com.jyoti.designPattern.Memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

	public List<Memento> mementoList = new ArrayList<Memento>();
	
	public void add(Memento memento)
	{
		mementoList.add(memento);
	}
	
	public Memento get(int index)
	{
		
		return mementoList.get(index);
	}
	
	
	
}
