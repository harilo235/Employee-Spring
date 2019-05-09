package com.hari.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hari.model.Employee;
import com.hari.service.EmployeeService;
import com.hari.service.impl.EmployeeServiceImpl;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		
		EmployeeService employeeService = ctx.getBean("employeeService", EmployeeServiceImpl.class);

		Employee employee = new Employee();
		employee.setEmployeeName("Hari");
		employee.setEmployeeEmail("ofc23hari@gmail.com");
		employee.setEmployeeGender("Male");
		employee.setEmployeeSalary(80000.00);
		
		employeeService.addEmployee(employee);
	}

}
