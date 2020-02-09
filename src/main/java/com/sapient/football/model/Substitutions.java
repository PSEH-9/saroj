package com.sapient.football.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Substitutions implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5799276969663020272L;
	@JsonProperty("homes")
	private Home[] homes;
	@JsonProperty("aways")
	private Away[] aways;

	public Home[] getHomes() {
		return homes;
	}

	public void setHomes(Home[] homes) {
		this.homes = homes;
	}

	public Away[] getAways() {
		return aways;
	}

	public void setAways(Away[] aways) {
		this.aways = aways;
	}

}
