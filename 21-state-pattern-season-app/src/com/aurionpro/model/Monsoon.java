package com.aurionpro.model;

public class Monsoon implements ISeason {

	public void nextSeason(SeasonContext seasonContext) {
		System.out.println("Monsoon season is running....");
		seasonContext.setSeason(new Winter());

	}

}
