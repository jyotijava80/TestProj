package com.jyoti.designPattern.Filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria {
  List<Person> MalePerson = new ArrayList<Person>();
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		
		for(Person person: persons)
		{
			if(person.getGender().equalsIgnoreCase("MALE"))
			{
				MalePerson.add(person);
			}
		}
		
		
		// TODO Auto-generated method stub
		return MalePerson;
	}

}
