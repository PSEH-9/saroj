package com.sapient.football.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StartingLineups implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7094983714679072084L;
	@JsonProperty("lineup_player")
	private String lineupPLayer;
	@JsonProperty("lineup_number")
	private int LineupNumber;
	@JsonProperty("lineup_position")
	private int lineupPosition;
	public String getLineupPLayer() {
		return lineupPLayer;
	}
	public void setLineupPLayer(String lineupPLayer) {
		this.lineupPLayer = lineupPLayer;
	}
	public int getLineupNumber() {
		return LineupNumber;
	}
	public void setLineupNumber(int lineupNumber) {
		LineupNumber = lineupNumber;
	}
	public int getLineupPosition() {
		return lineupPosition;
	}
	public void setLineupPosition(int lineupPosition) {
		this.lineupPosition = lineupPosition;
	}
	
	

}
