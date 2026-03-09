package com.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	
	@Id
	@Column(name="student_id")
	private int student_id;
	
	@Column
	private String name;
	@Column
	private String email;

	@Column
	private String mobile;
	
	
	public Student() {
		
	}	
	
	public Student(int id, String name, String email, String mobile) {
		super();
		this.student_id = id;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("Student details: " + this.student_id + " - " + this.name + " - ");
	}
	
	

}
