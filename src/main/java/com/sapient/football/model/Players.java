package com.sapient.football.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Players implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3443976533466578521L;
	@JsonProperty("player_key")
	private double playerKey;
	@JsonProperty("player_name")
	private String playerName;
	@JsonProperty("player_number")
	private int playerNumber;
	@JsonProperty("player_country")
	private String playerCountry;
	@JsonProperty("player_type")
	private String playerType;
	@JsonProperty("player_age")
	private int playerAge;
	@JsonProperty("player_match_played")
	private int playerMatchPlayed;
	@JsonProperty("player_goals")
	private int playerGoal;
	@JsonProperty("player_yellow_cards")
	private int playerYelloCard;
	@JsonProperty("player_red_cards")
	private int playerRedCards;
	
	@JsonProperty("team_name")
	private String teamName;
	@JsonProperty("team_key")
	private int teamKey;
	
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public int getTeamKey() {
		return teamKey;
	}
	public void setTeamKey(int teamKey) {
		this.teamKey = teamKey;
	}
	public double getPlayerKey() {
		return playerKey;
	}
	public void setPlayerKey(double playerKey) {
		this.playerKey = playerKey;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getPlayerNumber() {
		return playerNumber;
	}
	public void setPlayerNumber(int playerNumber) {
		this.playerNumber = playerNumber;
	}
	public String getPlayerCountry() {
		return playerCountry;
	}
	public void setPlayerCountry(String playerCountry) {
		this.playerCountry = playerCountry;
	}
	public String getPlayerType() {
		return playerType;
	}
	public void setPlayerType(String playerType) {
		this.playerType = playerType;
	}
	public int getPlayerAge() {
		return playerAge;
	}
	public void setPlayerAge(int playerAge) {
		this.playerAge = playerAge;
	}
	public int getPlayerMatchPlayed() {
		return playerMatchPlayed;
	}
	public void setPlayerMatchPlayed(int playerMatchPlayed) {
		this.playerMatchPlayed = playerMatchPlayed;
	}
	public int getPlayerGoal() {
		return playerGoal;
	}
	public void setPlayerGoal(int playerGoal) {
		this.playerGoal = playerGoal;
	}
	public int getPlayerYelloCard() {
		return playerYelloCard;
	}
	public void setPlayerYelloCard(int playerYelloCard) {
		this.playerYelloCard = playerYelloCard;
	}
	public int getPlayerRedCards() {
		return playerRedCards;
	}
	public void setPlayerRedCards(int playerRedCards) {
		this.playerRedCards = playerRedCards;
	}
	
	

}
