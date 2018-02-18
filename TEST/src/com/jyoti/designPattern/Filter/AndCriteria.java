package com.jyoti.designPattern.Filter;

import java.util.List;

public class AndCriteria implements Criteria {
	
	private Criteria criteria;
	private Criteria otherCriteria;
	public AndCriteria(Criteria criteria, Criteria otherCriteria) {
		super();
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}

	

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		// TODO Auto-generated method stub
		List<Person> firstPersonCriteria = criteria.meetCriteria(persons);
		return  otherCriteria.meetCriteria(firstPersonCriteria);
		
		}

}
