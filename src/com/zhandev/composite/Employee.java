package com.zhandev.composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	private String name; 
	private String dept;
	private float salary; 
	private List<Employee> subordinates;
	
	public Employee(String name, String dept, float salary) {
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		this.subordinates = new ArrayList<Employee>();
	}
	
	public void addSubordinate(Employee employee) {
		subordinates.add(employee);
	}
	
	public void removeSubordinate(Employee employee) {
		subordinates.remove(employee);
	}
	
	public List<Employee> getSubordinates() {
		return this.subordinates;
	}
	
	public String toString() {
		return ("Employee :[ Name : " + name + ", dept : " + dept + ", salary :" + salary + " ]");
	}
}
