package com.samplehibtest.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="departments")
public class Departments {

	@Id
	private String dept_no;
	private String dept_name;
	
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	public String getDept_no() {
		return dept_no;
	}
		
}
