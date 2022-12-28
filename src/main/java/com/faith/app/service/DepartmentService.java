package com.faith.app.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.dao.IDepartmentRepositry;

import com.faith.app.entity.Department;
@Service
public class DepartmentService implements IDepartmentService{
	
	@Autowired
	private IDepartmentRepositry departmentRep;

	@Override
	public List<Department> getDepartment() {
		// TODO Auto-generated method stub
		return (List<Department>) departmentRep.findAll();
		
	}

	@Override
	public void saveDepartment(Department department) {
		// TODO Auto-generated method stub
		departmentRep.save(department);
		
		
	}
	
	

}
