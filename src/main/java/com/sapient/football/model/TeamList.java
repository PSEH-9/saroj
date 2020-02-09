package com.sapient.football.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TeamList implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4896686232174960815L;
	private Team[] teams;

	public Team[] getTeams() {
		return teams;
	}

	public void setTeams(Team[] teams) {
		this.teams = teams;
	}


}
