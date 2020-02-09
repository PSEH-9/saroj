package com.sapient.football.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Cards implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5289384914920920893L;
	@JsonProperty("time")
	private int time;
	@JsonProperty("home_fault")
	private String homeFault;
	@JsonProperty("card")
	private String card;
	@JsonProperty("away_fault")
	private String AwayFault;
	@JsonProperty("info")
	private String info;
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public String getHomeFault() {
		return homeFault;
	}
	public void setHomeFault(String homeFault) {
		this.homeFault = homeFault;
	}
	public String getCard() {
		return card;
	}
	public void setCard(String card) {
		this.card = card;
	}
	public String getAwayFault() {
		return AwayFault;
	}
	public void setAwayFault(String awayFault) {
		AwayFault = awayFault;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	

}
