package com.zhandev.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> people) {
		List<Person> singlePeople = new ArrayList<Person>();

		people.forEach(p -> {
			if (p.getMaritalStatus().equalsIgnoreCase("single")) {
				singlePeople.add(p);
			}
		});
		
		return singlePeople;
	}

}
