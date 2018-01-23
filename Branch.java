package com.ts.us.dto;

public class Branch {

	private int id;
	private String location;
	private String city;
	private String state;
	private String country;
	private int postCode;
	
	public Branch() {
		System.out.println("BranchDTO object is created");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPostCode() {
		return postCode;
	}

	public void setPostCode(int postCode) {
		this.postCode = postCode;
	}

	@Override
	public String toString() {
		return "BranchDTO [id=" + id + ", location=" + location + ", city=" + city + ", state=" + state + ", country="
				+ country + ", postCode=" + postCode + "]";
	}
	
	
}
