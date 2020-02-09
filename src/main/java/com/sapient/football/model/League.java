package com.sapient.football.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class League implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 318639961600291335L;
	@JsonProperty("league_id")
	private int leagueId;
	@JsonProperty("league_name")
	private String leagueName;

	public int getLeagueId() {
		return leagueId;
	}

	public void setLeagueId(int leagueId) {
		this.leagueId = leagueId;
	}

	public String getLeagueName() {
		return leagueName;
	}

	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}

}
