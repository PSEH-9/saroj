package com.sapient.football.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Country implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@JsonProperty("country_id")
	private int countryId;
	@JsonProperty("country_name")
	private String countryName;

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public int getCountryId() {
		return countryId;
	}

	public String getCountryName() {
		return countryName;
	}
}
