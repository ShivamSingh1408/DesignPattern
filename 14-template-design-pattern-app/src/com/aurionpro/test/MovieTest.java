package com.aurionpro.test;

import com.aurionpro.model.ComedyMovie;
import com.aurionpro.model.HorrorMovie;
import com.aurionpro.model.MovieTemplate;

public class MovieTest {

	public static void main(String[] args) {
		MovieTemplate mt = new HorrorMovie();
		mt.makeMovie();
		System.out.println("----------------------------------");
		mt = new ComedyMovie();
		mt.makeMovie();
	}

}
