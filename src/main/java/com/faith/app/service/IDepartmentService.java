package com.faith.app.service;

import java.util.List;

import com.faith.app.entity.Department;
import com.faith.app.entity.Employee;

public interface IDepartmentService {
	
	//list
	
	public List<Department> getDepartment();
	
	//insert
		public void saveDepartment(Department department);

}
