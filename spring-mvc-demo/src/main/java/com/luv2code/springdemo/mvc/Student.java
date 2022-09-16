package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	private String country;
	private LinkedHashMap<String, String> countryOptions;
	private  String favouriteLanguge; 

	public Student() {

		// populate country options: used ISO country code
		countryOptions = new LinkedHashMap<String, String>();
		countryOptions.put("BR", "Brazil");
		countryOptions.put("EG", "Egypt");
		countryOptions.put("TU", "Tunis");
		countryOptions.put("ALG", "Algeria");
		countryOptions.put("IN", "India");

	}
	
	

	public void setFavouriteLanguge(String favouriteLanguge) {
		this.favouriteLanguge = favouriteLanguge;
	}



	public String getFavouriteLanguge() {
		return favouriteLanguge;
	}



	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
