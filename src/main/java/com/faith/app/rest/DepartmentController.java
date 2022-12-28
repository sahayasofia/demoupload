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
import com.faith.app.entity.Department;
import com.faith.app.entity.Employee;
import com.faith.app.service.IDepartmentService;
import com.faith.app.service.IEmployeeService;

@CrossOrigin //avoid conflict of port number in rest 
@RestController
@RequestMapping("/api")
public class DepartmentController {
	
	@Autowired
	private IDepartmentService departmentService;
	
	@GetMapping("/department")
	public List<Department> getDepartment(){
		return (List<Department>) departmentService.getDepartment();
		
		
	}
	//add Employee
		@PostMapping("/department")
		public void addEmployee(@RequestBody Department department){
			departmentService.saveDepartment(department);
			
		}
	
	
	

	

}
