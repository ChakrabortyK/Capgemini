package com.Hib.HibernateJPA;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class Student {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
	
	public Student( String name, String email, String mobile) {
		super();
//		this.student_id = id;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("Student details: " + this.student_id + " - " + this.name + " - ");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
	
	

}
