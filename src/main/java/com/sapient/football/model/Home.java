package com.sapient.football.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Home implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5263081167617921702L;
	@JsonProperty("time")
	private int time;
	@JsonProperty("substitution")
	private String substitution;
	@JsonProperty("starting_lineups")
	private StartingLineups[] startingLineups;
	@JsonProperty("substitutes")
	private Substitutes[] substitutes;
	@JsonProperty("missing_players")
	private MissingPlayers[] missing_players;
	@JsonProperty("coach")
	private Coach[] coach;
	
	public StartingLineups[] getStartingLineups() {
		return startingLineups;
	}
	public void setStartingLineups(StartingLineups[] startingLineups) {
		this.startingLineups = startingLineups;
	}
	public Substitutes[] getSubstitutes() {
		return substitutes;
	}
	public void setSubstitutes(Substitutes[] substitutes) {
		this.substitutes = substitutes;
	}
	public MissingPlayers[] getMissing_players() {
		return missing_players;
	}
	public void setMissing_players(MissingPlayers[] missing_players) {
		this.missing_players = missing_players;
	}
	public Coach[] getCoach() {
		return coach;
	}
	public void setCoach(Coach[] coach) {
		this.coach = coach;
	}
	
	
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public String getSubstitution() {
		return substitution;
	}
	public void setSubstitution(String substitution) {
		this.substitution = substitution;
	}
	

}
