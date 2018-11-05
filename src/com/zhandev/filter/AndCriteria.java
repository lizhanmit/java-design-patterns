package com.zhandev.filter;

import java.util.List;

public class AndCriteria implements Criteria {

	private Criteria criteria; 
	private Criteria anotherCriteria;
	
	public AndCriteria(Criteria criteria, Criteria anotherCriteria) {
		this.criteria = criteria;
		this.anotherCriteria = anotherCriteria;
	}

	@Override
	public List<Person> meetCriteria(List<Person> people) {
		return anotherCriteria.meetCriteria(criteria.meetCriteria(people));
	}
	
	  
}
