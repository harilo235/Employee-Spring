package com.app.sgic;

public class Student {
	
	private String StuName;

	public String getStuName() {
		return StuName;
	}

	public void setStuName(String stuName) {
		StuName = stuName;
	}
	
	public void displayInfo() {
		System.out.println("Hello: "+StuName);
	}
	
	

}