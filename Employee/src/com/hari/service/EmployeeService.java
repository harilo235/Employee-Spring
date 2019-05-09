package com.hari.service;

import java.util.List;

import com.hari.model.Employee;

public interface EmployeeService {
	
	public abstract void addEmployee(Employee employee);
	public abstract Employee fetchEmployeeById(int employeeId);
	public abstract void deleteEmployeeEmailByid(int employeeId);
	public abstract void updateEmployeeEmailById(String newEmail, int employeeId);
	public abstract List<Employee> getAllEmployeeDetails();

}
