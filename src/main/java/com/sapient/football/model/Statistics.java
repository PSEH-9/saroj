package com.sapient.football.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Statistics implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3061278667474149598L;
	@JsonProperty("type")
	private String type;
	@JsonProperty("home")
	private String home;
	@JsonProperty("away")
	private String away;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getHome() {
		return home;
	}
	public void setHome(String home) {
		this.home = home;
	}
	public String getAway() {
		return away;
	}
	public void setAway(String away) {
		this.away = away;
	}
	
}
