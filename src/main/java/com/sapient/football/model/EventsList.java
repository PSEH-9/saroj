package com.sapient.football.model;

import java.io.Serializable;

public class EventsList implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1534527933263589129L;
	private Events[] events;

	public Events[] getEvents() {
		return events;
	}

	public void setEvents(Events[] events) {
		this.events = events;
	}
	
	
}
