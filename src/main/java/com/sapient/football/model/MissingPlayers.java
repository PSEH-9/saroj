package com.sapient.football.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MissingPlayers implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6260500861424567314L;
	@JsonProperty("lineup_player")
	private String lineupPlayer;
	@JsonProperty("lineup_number")
	private int lineupNumber;
	@JsonProperty("lineup_position")
	private String lineupPosition;
	public String getLineupPlayer() {
		return lineupPlayer;
	}
	public void setLineupPlayer(String lineupPlayer) {
		this.lineupPlayer = lineupPlayer;
	}
	public int getLineupNumber() {
		return lineupNumber;
	}
	public void setLineupNumber(int lineupNumber) {
		this.lineupNumber = lineupNumber;
	}
	public String getLineupPosition() {
		return lineupPosition;
	}
	public void setLineupPosition(String lineupPosition) {
		this.lineupPosition = lineupPosition;
	}
	
	
}
