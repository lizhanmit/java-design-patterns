package com.zhandev.dao;

import java.util.List;

public interface StudentDao {

	public Student getStudent(String stdId);
	public void updateStudent(Student student);
	public void deleteStudent(String stdId);
	public List<Student> getAllStudents();
}
