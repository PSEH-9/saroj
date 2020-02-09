package com.sapient.football.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Away implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4434698666845894915L;
	@JsonProperty("time")
	private int time;
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

	@JsonProperty("substitution")
	private String substitution;
	
	private StartingLineups[] startingLineups;
	
	private Substitutes[] substitutes;

	private MissingPlayers[] missing_players;
	
	private Coach[] coach;

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
