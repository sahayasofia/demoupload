package com.faith.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.dao.IEmployeeRepository;
import com.faith.app.dto.EmployeeDeptDto;
import com.faith.app.entity.Employee;
@Service
public class EmployeeServicemple  implements IEmployeeService{
	
	@Autowired
	private IEmployeeRepository employeeRep;

	@Override
	public List<Employee> getEmployee() {
		// TODO Auto-generated method stub
		return (List<Employee>) employeeRep.findAll();
	
	}
	@Override
	public void saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeRep.save(employee);
		
	}

	@Override
	public Optional<Employee> getEmployee(int id) {
		// TODO Auto-generated method stub
		return employeeRep.findById(id);
	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		employeeRep.deleteById(id);
		
	}
	@Override
	public List<Employee> getEmployeesByEmployeeName(String name) {
		// TODO Auto-generated method stub
		return employeeRep.findByEmployeeName(name);
	}
	@Override
	public List<EmployeeDeptDto> getAllDepartEmployees() {
		// TODO Auto-generated method stub
		return (List<EmployeeDeptDto>) employeeRep.findAllEmployees();
	}
	
	

}
