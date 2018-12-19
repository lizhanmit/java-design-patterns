package com.zhandev.dao;

public class DAOPatternDemo {

	static StudentDaoImpl studentDaoImpl = new StudentDaoImpl();
	
	public static void main(String[] args) {
		printAllStudents();

		/*
		 * get student 1001
		 */
		System.out.println("------ get student 1001 ------");
		System.out.println(studentDaoImpl.getStudent("1001"));
		
		
		/*
		 * update student 1001
		 */
		System.out.println("------ update student 1001 ------");
		Student student = studentDaoImpl.getStudent("1001");
		student.setName("Liu Zhao");
		studentDaoImpl.updateStudent(student);
		printAllStudents();
		
		
		/*
		 * delete student 1001
		 */
		System.out.println("------ delete student 1001 ------");
		studentDaoImpl.deleteStudent("1001");
		printAllStudents();
	}
	
	public static void printAllStudents() {
		System.out.println("------ print all students ------");
		studentDaoImpl.getAllStudents().forEach(System.out::println);
	}
}
