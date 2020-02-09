package com.sapient.football.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Standings implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@JsonProperty("country_name")
	private String countryName;
	@JsonProperty("league_id")
	private int leagueId;
	@JsonProperty("league_name")
	private String leagueName;
	@JsonProperty("team_id")
	private int teamId;
	@JsonProperty("team_name")
	private String teamName;
	@JsonProperty("overall_league_position")
	private String overallLeaguePosition;
	@JsonProperty("overall_league_payed")
	private int overallLeaguePayed;
	@JsonProperty("overall_league_W")
	private int overallLeagueW;
	@JsonProperty("overall_league_D")
	private int overallLeagueD;
	@JsonProperty("overall_league_L")
	private int overallLeagueL;
	@JsonProperty("overall_league_GF")
	private int oevrallLeagueGF;
	@JsonProperty("overall_league_GA")
	private int overallLeagueGA;
	@JsonProperty("overall_league_PTS")
	private int overallLeaguePTS;
	@JsonProperty("home_league_position")
	private int homeLeaguePositon;
	@JsonProperty("home_league_payed")
	private int homeLeaguePayed;
	@JsonProperty("home_league_W")
	private int homeLeagueW;
	@JsonProperty("home_league_D")
	private int homeLeagueD;
	@JsonProperty("home_league_L")
	private int homeLeagueL;
	@JsonProperty("home_league_GF")
	private int homeLeagueGF;
	@JsonProperty("home_league_GA")
	private int homeLeagueGA;
	@JsonProperty("home_league_PTS")
	private int homeLeaguePTS;
	@JsonProperty("away_league_position")
	private int awayLeaguePosition;
	@JsonProperty("away_league_payed")
	private int awayLeaguePayed;
	@JsonProperty("away_league_W")
	private int awayLeagueW;
	@JsonProperty("away_league_D")
	private int awayLeagueD;
	@JsonProperty("away_league_L")
	private int awayLeagueL;
	@JsonProperty("away_league_GF")
	private int awayLeagueGF;
	@JsonProperty("away_league_GA")
	private int awaLeagueGA;
	@JsonProperty("away_league_PTS")
	private int awayLeaguePTS;
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
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
	public int getTeamId() {
		return teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getOverallLeaguePosition() {
		return overallLeaguePosition;
	}
	public void setOverallLeaguePosition(String overallLeaguePosition) {
		this.overallLeaguePosition = overallLeaguePosition;
	}
	public int getOverallLeaguePayed() {
		return overallLeaguePayed;
	}
	public void setOverallLeaguePayed(int overallLeaguePayed) {
		this.overallLeaguePayed = overallLeaguePayed;
	}
	public int getOverallLeagueW() {
		return overallLeagueW;
	}
	public void setOverallLeagueW(int overallLeagueW) {
		this.overallLeagueW = overallLeagueW;
	}
	public int getOverallLeagueD() {
		return overallLeagueD;
	}
	public void setOverallLeagueD(int overallLeagueD) {
		this.overallLeagueD = overallLeagueD;
	}
	public int getOverallLeagueL() {
		return overallLeagueL;
	}
	public void setOverallLeagueL(int overallLeagueL) {
		this.overallLeagueL = overallLeagueL;
	}
	public int getOevrallLeagueGF() {
		return oevrallLeagueGF;
	}
	public void setOevrallLeagueGF(int oevrallLeagueGF) {
		this.oevrallLeagueGF = oevrallLeagueGF;
	}
	public int getOverallLeagueGA() {
		return overallLeagueGA;
	}
	public void setOverallLeagueGA(int overallLeagueGA) {
		this.overallLeagueGA = overallLeagueGA;
	}
	public int getOverallLeaguePTS() {
		return overallLeaguePTS;
	}
	public void setOverallLeaguePTS(int overallLeaguePTS) {
		this.overallLeaguePTS = overallLeaguePTS;
	}
	public int getHomeLeaguePositon() {
		return homeLeaguePositon;
	}
	public void setHomeLeaguePositon(int homeLeaguePositon) {
		this.homeLeaguePositon = homeLeaguePositon;
	}
	public int getHomeLeaguePayed() {
		return homeLeaguePayed;
	}
	public void setHomeLeaguePayed(int homeLeaguePayed) {
		this.homeLeaguePayed = homeLeaguePayed;
	}
	public int getHomeLeagueW() {
		return homeLeagueW;
	}
	public void setHomeLeagueW(int homeLeagueW) {
		this.homeLeagueW = homeLeagueW;
	}
	public int getHomeLeagueD() {
		return homeLeagueD;
	}
	public void setHomeLeagueD(int homeLeagueD) {
		this.homeLeagueD = homeLeagueD;
	}
	public int getHomeLeagueL() {
		return homeLeagueL;
	}
	public void setHomeLeagueL(int homeLeagueL) {
		this.homeLeagueL = homeLeagueL;
	}
	public int getHomeLeagueGF() {
		return homeLeagueGF;
	}
	public void setHomeLeagueGF(int homeLeagueGF) {
		this.homeLeagueGF = homeLeagueGF;
	}
	public int getHomeLeagueGA() {
		return homeLeagueGA;
	}
	public void setHomeLeagueGA(int homeLeagueGA) {
		this.homeLeagueGA = homeLeagueGA;
	}
	public int getHomeLeaguePTS() {
		return homeLeaguePTS;
	}
	public void setHomeLeaguePTS(int homeLeaguePTS) {
		this.homeLeaguePTS = homeLeaguePTS;
	}
	public int getAwayLeaguePosition() {
		return awayLeaguePosition;
	}
	public void setAwayLeaguePosition(int awayLeaguePosition) {
		this.awayLeaguePosition = awayLeaguePosition;
	}
	public int getAwayLeaguePayed() {
		return awayLeaguePayed;
	}
	public void setAwayLeaguePayed(int awayLeaguePayed) {
		this.awayLeaguePayed = awayLeaguePayed;
	}
	public int getAwayLeagueW() {
		return awayLeagueW;
	}
	public void setAwayLeagueW(int awayLeagueW) {
		this.awayLeagueW = awayLeagueW;
	}
	public int getAwayLeagueD() {
		return awayLeagueD;
	}
	public void setAwayLeagueD(int awayLeagueD) {
		this.awayLeagueD = awayLeagueD;
	}
	public int getAwayLeagueL() {
		return awayLeagueL;
	}
	public void setAwayLeagueL(int awayLeagueL) {
		this.awayLeagueL = awayLeagueL;
	}
	public int getAwayLeagueGF() {
		return awayLeagueGF;
	}
	public void setAwayLeagueGF(int awayLeagueGF) {
		this.awayLeagueGF = awayLeagueGF;
	}
	public int getAwaLeagueGA() {
		return awaLeagueGA;
	}
	public void setAwaLeagueGA(int awaLeagueGA) {
		this.awaLeagueGA = awaLeagueGA;
	}
	public int getAwayLeaguePTS() {
		return awayLeaguePTS;
	}
	public void setAwayLeaguePTS(int awayLeaguePTS) {
		this.awayLeaguePTS = awayLeaguePTS;
	}
	
}
