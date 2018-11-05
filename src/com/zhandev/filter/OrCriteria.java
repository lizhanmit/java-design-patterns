package com.zhandev.filter;

import java.util.List;

public class OrCriteria implements Criteria {

	private Criteria criteria; 
	private Criteria anotherCriteria;
	
	public OrCriteria(Criteria criteria, Criteria anotherCriteria) {
		this.criteria = criteria;
		this.anotherCriteria = anotherCriteria;
	}

	@Override
	public List<Person> meetCriteria(List<Person> people) {
		List<Person> criteriaPeople = criteria.meetCriteria(people);
		List<Person> anotherCriteriaPeople = anotherCriteria.meetCriteria(people);
		
		anotherCriteriaPeople.forEach(p -> {
			if (!criteriaPeople.contains(p)) {
				criteriaPeople.add(p);
			}
		});
		
		return criteriaPeople;
	}
	
	  
}
