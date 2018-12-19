package com.zhandev.dao;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

	private List<Student> students;
	
	public StudentDaoImpl() {
		students = new ArrayList<Student>();
		students.add(new Student("1001", "San Zhang"));
		students.add(new Student("1002", "Si Li"));
	}

	@Override
	public Student getStudent(String stdId) {
		for (Student student : students) {
			if (student.getStdId().equals(stdId)) {
				return student;
			}
		}
		
		return null;
	}

	@Override
	public void updateStudent(Student student) {
		for (Student std : students) {
			if (std.getStdId().equals(student.getStdId())) {
				std.setName(student.getName());
				System.out.println("Student: Stduent id " + student.getStdId() + ", updated in the database.");
				break;
			}
		}
	}

	@Override
	public void deleteStudent(String stdId) {
		for (Student student : students) {
			if (student.getStdId().equals(stdId)) {
				students.remove(student);
				System.out.println("Student: Stduent id " + student.getStdId() + ", deleted in the database.");
				break;
			}
		}
	}

	@Override
	public List<Student> getAllStudents() {
		return students;
	}

}
