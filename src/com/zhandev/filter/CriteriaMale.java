package com.zhandev.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> people) {
		List<Person> malePeople = new ArrayList<Person>();
		
		people.forEach(p -> {
			if (p.getGender().equalsIgnoreCase("male")) {
				malePeople.add(p);
			}
		});
		
		return malePeople;
	}

}
