package com.sapient.football.model;

import java.io.Serializable;

public class CountryList implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Country[] countries;
	public Country[] getCountries() {
		return countries;
	}
	public void setCountries(Country[] countries) {
		this.countries = countries;
	}


}
