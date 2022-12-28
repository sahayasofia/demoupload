package com.faith.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.faith.app.dto.EmployeeDeptDto;
import com.faith.app.entity.Employee;


@Repository
public interface IEmployeeRepository extends CrudRepository<Employee, Integer>{
	
	//custom methods
	@Query("from Employee where employeeName like %?1%")
	public List<Employee> findByEmployeeName(String name);
	
	@Query("SELECT new com.faith.app.dto.EmployeeDeptDto(e.id,e.employeename,e.designation,d.departmentName) FROM Employee e INNER JOIN e.department d ORDER BY e.id")
	public List<EmployeeDeptDto> findAllEmployees();
	

}

