package com.jyoti.designPattern.Filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria {
  List<Person> FemalePerson = new ArrayList<Person>();
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		
		for(Person person: persons)
		{
			if(person.getGender().equalsIgnoreCase("FEMALE"))
			{
				FemalePerson.add(person);
			}
		}
		
		
		// TODO Auto-generated method stub
		return FemalePerson;
	}

}
