package com.aurionpro.test;

import com.aurionpro.model.Monsoon;
import com.aurionpro.model.SeasonContext;

public class Test {

	public static void main(String[] args) {
		SeasonContext seasonContext = new SeasonContext();
		seasonContext.nextSeason();
		seasonContext.nextSeason();
		seasonContext.nextSeason();
		System.out.println("----------------");
		System.out.println("Setting current season to Monsoon Season");
		seasonContext.setSeason(new Monsoon());
		seasonContext.nextSeason();
		seasonContext.nextSeason();
	}

}
