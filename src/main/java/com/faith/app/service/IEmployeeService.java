package com.faith.app.service;

import java.util.List;
import java.util.Optional;

import com.faith.app.dto.EmployeeDeptDto;
import com.faith.app.entity.Employee;

public interface IEmployeeService {
	
	//list
	
	public List<Employee> getEmployee();
	
	//insert
	public void saveEmployee(Employee employee);
	
	//update by id
	public Optional<Employee> getEmployee(int id);
	
	//delete
	public void deleteEmployee(int id);
	
	//search by name
	
	public List<Employee> getEmployeesByEmployeeName(String name);
	
	//gett All employee ineer join
	
	public List<EmployeeDeptDto> getAllDepartEmployees();
	

}
