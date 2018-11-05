package com.zhandev.mvc;

public class StudentController {

	private Student model; 
	private StudentView view;
	
	public StudentController(Student model, StudentView view) {
		this.model = model;
		this.view = view;
	} 
	
	public void setStudentId(String stdId) {
		model.setStdId(stdId);
	}
	
	public String getStudentId() {
		return model.getStdId();
	}
	
	public void setStudentName(String name) {
		model.setName(name);
	}
	
	public String getStudentName() {
		return model.getName();
	}
	
	public void updateView() {
		view.printStudentDetails(model);
	}
}
