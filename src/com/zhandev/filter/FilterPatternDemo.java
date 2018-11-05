package com.zhandev.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterPatternDemo {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<Person>();
		
		people.add(new Person("Robert","Male", "Single"));
		people.add(new Person("John", "Male", "Married"));
		people.add(new Person("Laura", "Female", "Married"));
		people.add(new Person("Diana", "Female", "Single"));
		people.add(new Person("Mike", "Male", "Single"));
		people.add(new Person("Bobby", "Male", "Single"));
		
		Criteria criteriaMale = new CriteriaMale(); 
		Criteria criteriaFemale = new CriteriaFemale(); 
		Criteria criteriaSingle = new CriteriaSingle(); 
		Criteria criteriaSingleAndMale = new AndCriteria(criteriaMale, criteriaSingle); 
		Criteria criteriaSingleOrFemale = new OrCriteria(criteriaFemale, criteriaSingle); 
		
		System.out.println("Males: ");
		printPeople(criteriaMale.meetCriteria(people));
		
		System.out.println("\nFemales: ");
		printPeople(criteriaFemale.meetCriteria(people));
		
		System.out.println("\nSingle Males: ");
		printPeople(criteriaSingleAndMale.meetCriteria(people));
		
		System.out.println("\nSingle Or Females: ");
		printPeople(criteriaSingleOrFemale.meetCriteria(people));
	}
	
	public static void printPeople(List<Person> people) {
		people.forEach(p -> System.out.println("Person : [ Name : " + p.getName() + ", Gender : " + p.getGender()
					+ ", Marital Status : " + p.getMaritalStatus() + " ]"));
	}
}
