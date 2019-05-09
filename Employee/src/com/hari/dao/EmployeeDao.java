package com.hari.dao;

import java.util.List;

import com.hari.model.Employee;

public interface EmployeeDao {
	
	public abstract void createEmployee(Employee employee);
	public abstract Employee getEmployeeById(int employeeId);
	public abstract void deleteEmployeeByid(int employeeId);
	public abstract void updateEmployeeEmailById(String newEmail, int employeeId);
	public abstract List<Employee> getAllEmployeeDetails();

}
