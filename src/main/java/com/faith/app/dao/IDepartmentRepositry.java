package com.faith.app.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.faith.app.entity.Department;
import com.faith.app.entity.Employee;

@Repository
public interface IDepartmentRepositry extends CrudRepository<Department, Integer>{

}
