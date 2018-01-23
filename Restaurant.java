package com.ts.us.dto;

public class Restaurant {

	private int id;
	private String govID;
	private String name;
	private String password;
	private String logoName;
	
	public Restaurant() {
		System.out.println("RestaurantDTO obj is created");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGovID() {
		return govID;
	}

	public void setGovID(String govID) {
		this.govID = govID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLogoName() {
		return logoName;
	}

	public void setLogoName(String logoName) {
		this.logoName = logoName;
	}

	@Override
	public String toString() {
		return "RestaurantDTO [id=" + id + ", govID=" + govID + ", name=" + name + ", password=" + password
				+ ", logoName=" + logoName + "]";
	}
	
	
}
