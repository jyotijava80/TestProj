package com.jyoti.designPattern.Filter;

import java.util.List;

public class OrCriteria implements Criteria {
	
	private Criteria criteria;
	private Criteria otherCriteria;
	public OrCriteria(Criteria criteria, Criteria otherCriteria) {
		super();
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}

	

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		// TODO Auto-generated method stub
		List<Person> firstCriteriaItem = criteria.meetCriteria(persons);
		List<Person> otherCriteriaItem = otherCriteria.meetCriteria(persons);
		
		for(Person person: otherCriteriaItem)
		{
			if(!(firstCriteriaItem.contains(person)))
				firstCriteriaItem.add(person);
		}
		
		return firstCriteriaItem;
		
		}

}
