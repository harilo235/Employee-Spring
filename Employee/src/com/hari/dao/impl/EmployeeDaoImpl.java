package com.hari.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import com.hari.dao.EmployeeDao;
import com.hari.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	
	//dependency injection
	private DataSource datasource;

	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}

	@Override
	public void createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Connection connection = null;
		PreparedStatement ps = null;
		
		try {
			connection = datasource.getConnection();
			String SQL="INSERT INTO employee(employee_name,employee_email,employee_gender,employee_salary) VALUES (?,?,?,?)";
			ps = connection.prepareStatement(SQL);
			
			ps.setString(1, employee.getEmployeeName());
			ps.setString(2, employee.getEmployeeEmail());
			ps.setString(3, employee.getEmployeeGender());
			ps.setDouble(4, employee.getEmployeeSalary());
			
			int executeUpdate =ps.executeUpdate();
			if(executeUpdate>0) {
				System.out.println("Employee is created");
			}
			
		}catch(Exception e) {
				e.printStackTrace();
			}finally {
				if(connection!= null) {
					try {
						connection.close();
					}catch(SQLException e) {
						e.printStackTrace();
					}
				}
			}
			
	}

	@Override
	public Employee getEmployeeById(int employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployeeByid(int employeeId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEmployeeEmailById(String newEmail, int employeeId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> getAllEmployeeDetails() {
		// TODO Auto-generated method stub
		return null;
	}

}
