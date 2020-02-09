package com.sapient.football.model;

import java.io.Serializable;

public class StandingsList implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8391639995628914604L;
	private Standings[] standings;

	public Standings[] getStandings() {
		return standings;
	}

	public void setStandings(Standings[] standings) {
		this.standings = standings;
	}
	
	

}
