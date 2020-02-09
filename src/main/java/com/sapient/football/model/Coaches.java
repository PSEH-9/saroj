package com.sapient.football.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Coaches implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2755755736593114263L;
	@JsonProperty("coach_name")
	private String coachName;
	@JsonProperty("coach_country")
	private String coachCountry;
	@JsonProperty("coach_age")
	private int caochAge;
	public String getCoachName() {
		return coachName;
	}
	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}
	public String getCoachCountry() {
		return coachCountry;
	}
	public void setCoachCountry(String coachCountry) {
		this.coachCountry = coachCountry;
	}
	public int getCaochAge() {
		return caochAge;
	}
	public void setCaochAge(int caochAge) {
		this.caochAge = caochAge;
	}
	


}
