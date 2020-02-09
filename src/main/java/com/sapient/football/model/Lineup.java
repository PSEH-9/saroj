package com.sapient.football.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Lineup implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8921725210686536365L;
	@JsonProperty("home")
	private Home home;

	public Home getHome() {
		return home;
	}

	public void setHome(Home home) {
		this.home = home;
	}

}
