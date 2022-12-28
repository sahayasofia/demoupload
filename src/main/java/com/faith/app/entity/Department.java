package com.faith.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
	@Table(name="department")
	public class Department {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Integer departmentId;
		
		@Column(name="departmentname",nullable=false,length=60)
		private String departmentName;
		public Department(Integer departmentId, String departmentName) {
			super();
			this.departmentId = departmentId;
			this.departmentName = departmentName;
		}
		public Department() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Integer getDepartmentId() {
			return departmentId;
		}
		public void setDepartmentId(Integer departmentId) {
			this.departmentId = departmentId;
		}
		public String getDepartmentName() {
			return departmentName;
		}
		public void setDepartmentName(String departmentName) {
			this.departmentName = departmentName;
		}
		
		
		

	}
	


