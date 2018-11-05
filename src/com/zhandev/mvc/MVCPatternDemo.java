package com.zhandev.mvc;


public class MVCPatternDemo {

	public static void main(String[] args) {
		Student model = retriveStudentFromDatabase();
		StudentView view = new StudentView();
		StudentController controller = new StudentController(model, view);
		
		controller.updateView();
		
		controller.setStudentName("Si Li");
		
		controller.updateView();
	}

	private static Student retriveStudentFromDatabase() {
		// code here should be to retrive student data from database
		// below are for the purpose of demo 
		Student student = new Student();
		student.setStdId("1001");
		student.setName("San Zhang");
		return student;
	}
}
