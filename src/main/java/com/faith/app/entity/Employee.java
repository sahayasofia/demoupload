package com.faith.app.entity;


	
	

	import java.time.LocalDate;



	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.JoinColumn;
	import javax.persistence.ManyToOne;
	import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

	@Entity
	@Table(name="employee")
	public class Employee {

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Integer id;
		
		@Column(name="employeename",nullable=false,length=40)
		private String employeename;
		
		@Column(name="designation",nullable=false,length=40)
		private String designation;
		
		@Column(name="dateofjoining",nullable=false,length=40)
		private LocalDate dateofjoining;
		
		private boolean isActive;
		
		 //FK
		private Integer departmentId;
		
	    @ManyToOne
		@JoinColumn(name="departmentId",insertable=false,updatable=false)
		private Department department;

	    @JsonBackReference  //only we get id other value cannot come
		public Department getDepartment() {
			return department;
		}

		public void setDepartment(Department department) {
			this.department = department;
		}

		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}

		public boolean isActive() {
			return isActive;
		}

		public void setActive(boolean isActive) {
			this.isActive = isActive;
		}

		public Employee(Integer id, String employeename, String designation, LocalDate dateofjoining, boolean isActive,
				Integer departmentId, Department department) {
			super();
			this.id = id;
			this.employeename = employeename;
			this.designation = designation;
			this.dateofjoining = dateofjoining;
			this.isActive = isActive;
			this.departmentId = departmentId;
			this.department = department;
		}

		public Employee(Integer id, String employeename, String designation, LocalDate dateofjoining, Integer departmentId,
				Department department) {
			super();
			this.id = id;
			this.employeename = employeename;
			this.designation = designation;
			this.dateofjoining = dateofjoining;
			this.departmentId = departmentId;
			this.department = department;
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

		public LocalDate getDateofjoining() {
			return dateofjoining;
		}

		public void setDateofjoining(LocalDate dateofjoining) {
			this.dateofjoining = dateofjoining;
		}

		public Integer getDepartmentId() {
			return departmentId;
		}

		public void setDepartmentId(Integer departmentId) {
			this.departmentId = departmentId;
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", employeename=" + employeename + ", designation=" + designation
					+ ", dateofjoining=" + dateofjoining + ", departmentId=" + departmentId + "]";
		}

}
