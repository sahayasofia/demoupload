package com.faith.app.rest;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faith.app.dto.EmployeeDeptDto;
import com.faith.app.entity.Employee;
import com.faith.app.service.IEmployeeService;

@CrossOrigin //avoid conflict of port number in rest 
@RestController
@RequestMapping("/api")
public class EmployeeReastController {
	@Autowired  //
	private IEmployeeService employeeService;
	
	@GetMapping("/employees")
	public List<Employee> getEmployee(){
		return employeeService.getEmployee();
		
	}
	
	//get employee by Id
	@GetMapping("/employees/{id}")
	public Optional<Employee> getEmployee(@PathVariable int id){ //
		return employeeService.getEmployee(id);
		
	}
	
	//add Employee
	@PostMapping("/employees")
	public void addEmployee(@RequestBody Employee employee){
		employeeService.saveEmployee(employee);
		
	}
	
	
	//update Employee
	@PutMapping("/employees")
	public void updateEmployee(@RequestBody Employee employee) {
		employeeService.saveEmployee(employee);
		
	}
	
	//delete Employee
	@DeleteMapping("/employees/{id}")
	public void deleteEmployee(@PathVariable int id) {
		employeeService.deleteEmployee(id);
		
	}
	
	//custom method using JPQl
	
	@GetMapping("/employees/search/{name}")
	public List<Employee> getAllEmployeesByName(@PathVariable String name){
		return employeeService.getEmployeesByEmployeeName(name);
		
	}
	
	@GetMapping("/employees/dto")
	public List<EmployeeDeptDto> getAllEmployeeAndDept(){
		return employeeService.getAllDepartEmployees();
		
	}

}
