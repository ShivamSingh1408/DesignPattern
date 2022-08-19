package com.aurionpro.model;

public class Winter implements ISeason {

	public void nextSeason(SeasonContext seasonContext) {
		System.out.println("Winter season is running.....");
		seasonContext.setSeason(new Summer());
	}

}
