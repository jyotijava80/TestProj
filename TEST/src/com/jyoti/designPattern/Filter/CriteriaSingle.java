package com.jyoti.designPattern.Filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements Criteria {
  List<Person> SinglePerson = new ArrayList<Person>();
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		
		for(Person person: persons)
		{
			if(person.getGender().equalsIgnoreCase("SINGLE"))
			{
				SinglePerson.add(person);
			}
		}
		
		
		// TODO Auto-generated method stub
		return SinglePerson;
	}

}
