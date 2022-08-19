package com.aurionpro.model;

public class HorrorMovie extends MovieTemplate {

	@Override
	public void selectScript() {
		System.out.println("Selecting a Horror Script");
	}

	@Override
	public void addContent() {
		System.out.println("Adding Some SuperNatural Activities as content");
	}
	@Override
	public void addSong() {
		System.out.println("Adding Some Screaming and Scary voices");
	}

}
