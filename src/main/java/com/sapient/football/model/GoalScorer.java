package com.sapient.football.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GoalScorer implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5255520931883062641L;
	@JsonProperty("time")
	private int time;
	@JsonProperty("home_scorer")
	private String homeScorer;
	@JsonProperty("score")
	private String score;
	@JsonProperty("away_scorer")
	private String awayScorer;
	@JsonProperty("info")
	private String info;
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public String getHomeScorer() {
		return homeScorer;
	}
	public void setHomeScorer(String homeScorer) {
		this.homeScorer = homeScorer;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public String getAwayScorer() {
		return awayScorer;
	}
	public void setAwayScorer(String awayScorer) {
		this.awayScorer = awayScorer;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}

}
