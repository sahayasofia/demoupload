package com.faith.app.dto;

public class EmployeeDeptDto {
	private Integer id;
	private String employeename;
	private String designation;
	private String departmentName;
	public EmployeeDeptDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeDeptDto(Integer id, String employeename, String designation, String departmentName) {
		super();
		this.id = id;
		this.employeename = employeename;
		this.designation = designation;
		this.departmentName = departmentName;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	@Override
	public String toString() {
		return "EmployeeDeptDto [id=" + id + ", employeename=" + employeename + ", designation=" + designation
				+ ", departmentName=" + departmentName + "]";
	}
}