package com.sapient.football.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Team implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1374324700158033988L;
	@JsonProperty("team_key")
	private int teamKey;
	@JsonProperty("team_name")
	private String teamName;
	@JsonProperty("team_badge")
	private String teamBadge;
	
	private Players[] players;
	
	private Coaches[] coaches;

	public int getTeamKey() {
		return teamKey;
	}

	public void setTeamKey(int teamKey) {
		this.teamKey = teamKey;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getTeamBadge() {
		return teamBadge;
	}

	public void setTeamBadge(String teamBadge) {
		this.teamBadge = teamBadge;
	}

	public Players[] getPlayers() {
		return players;
	}

	public void setPlayers(Players[] players) {
		this.players = players;
	}

	public Coaches[] getCoaches() {
		return coaches;
	}

	public void setCoaches(Coaches[] coaches) {
		this.coaches = coaches;
	}
	
	

}
