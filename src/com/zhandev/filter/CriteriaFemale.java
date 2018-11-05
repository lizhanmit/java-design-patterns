package com.zhandev.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> people) {
		List<Person> femalePeople = new ArrayList<Person>();
		
		people.forEach(p -> {
			if (p.getGender().equalsIgnoreCase("female")) {
				femalePeople.add(p);
			}
		});
		
		return femalePeople;
	}

}
