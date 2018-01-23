package com.ts.us.dto;

import java.util.List;

public class Cuisine {

	private int id;
	private String name;
	private String country;
	private List<Recipe> recipeList;
	
	public Cuisine() {
		System.out.println("CuisineDTO obj is created.. ");
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "CuisineDTO [id=" + id + ", name=" + name + ", country=" + country + "]";
	}
	
	 
}
