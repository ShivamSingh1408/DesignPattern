package com.aurionpro.model;

public class Summer implements ISeason {

	public void nextSeason(SeasonContext seasonContext) {
		System.out.println("Summer season is running........");
		seasonContext.setSeason(new Monsoon());
	}

}
