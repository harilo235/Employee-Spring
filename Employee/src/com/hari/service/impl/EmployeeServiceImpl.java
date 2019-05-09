package com.hari.service.impl;

import java.util.List;

import com.hari.dao.EmployeeDao;
import com.hari.model.Employee;
import com.hari.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService{
	
	//dependency injection
	private EmployeeDao employeeDao;


	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeDao.createEmployee(employee);
		
	}

	@Override
	public Employee fetchEmployeeById(int employeeId) {
		// TODO Auto-generated method stub
		return employeeDao.getEmployeeById(employeeId);
	}

	@Override
	public void deleteEmployeeEmailByid(int employeeId) {
		// TODO Auto-generated method stub
		employeeDao.deleteEmployeeByid(employeeId);
	}

	@Override
	public void updateEmployeeEmailById(String newEmail, int employeeId) {
		// TODO Auto-generated method stub
		employeeDao.updateEmployeeEmailById(newEmail, employeeId);
	}

	@Override
	public List<Employee> getAllEmployeeDetails() {
		// TODO Auto-generated method stub
		return employeeDao.getAllEmployeeDetails();
	}

	
}
