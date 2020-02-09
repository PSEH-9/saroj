package com.sapient.football.model;

import java.io.Serializable;

public class CountryLeagueList implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7735484964112354117L;
	private CountryLeague[] countryLeagues;

	public CountryLeague[] getCountryLeagues() {
		return countryLeagues;
	}

	public void setCountryLeagues(CountryLeague[] countryLeagues) {
		this.countryLeagues = countryLeagues;
	}

}
