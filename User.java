package com.ts.us.dto;

import java.util.Date;

public class User {

	private int id;
	private String name;
	private String gender;
	private String email;
	private String password;
	private long mobile_number;
	private java.sql.Date dob;
	
	public User() {
		System.out.println("userDTO obj is created..");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getMobile_number() {
		return mobile_number;
	}

	public void setMobile_number(long mobile_number) {
		this.mobile_number = mobile_number;
	}

	public java.sql.Date getDate() {
		return dob;
	}

	public void setDate(java.sql.Date date) {
		this.dob = date;
	}

	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", name=" + name + ", gender=" + gender + ", email=" + email + ", password="
				+ password + ", mobile_number=" + mobile_number + ", date=" + dob + "]";
	}
	
	
}
