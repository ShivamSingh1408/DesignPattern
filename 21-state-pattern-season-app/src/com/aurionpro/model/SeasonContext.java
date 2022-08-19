package com.aurionpro.model;

public class SeasonContext {
	ISeason season;

	public SeasonContext() {
		this.season = new Summer();
	}

	public void setSeason(ISeason season) {
		this.season = season;
	}
	
	public void nextSeason() {
		this.season.nextSeason(this);
	}



	
}
