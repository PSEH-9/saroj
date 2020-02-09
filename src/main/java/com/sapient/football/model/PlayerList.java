package com.sapient.football.model;

import java.io.Serializable;

public class PlayerList implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2478572305550547503L;
	private Players[] players;

	public Players[] getPlayers() {
		return players;
	}

	public void setPlayers(Players[] players) {
		this.players = players;
	}
	
	

}
