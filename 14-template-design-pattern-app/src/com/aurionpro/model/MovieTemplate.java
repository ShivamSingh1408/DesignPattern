package com.aurionpro.model;

public abstract class MovieTemplate {
	public final void makeMovie() {
		selectScript();
		addContent();
		storyBuilding();
		addSong();
		addClimax();
	}

	public abstract void selectScript();

	public abstract void addContent();

	public void storyBuilding() {
		System.out.println("Buliding the core of story");
	}

	public void addSong() {
		System.out.println("adding some songs..");
	}

	public final void addClimax() {
		System.out.println("Adding best Climax ever");
	}

}
