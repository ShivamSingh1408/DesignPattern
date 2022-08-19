package com.aurionpro.model;

public class ComedyMovie extends MovieTemplate {

	@Override
	public void selectScript() {
		System.out.println("Selecting a Comedy genre Script");
	}

	@Override
	public void addContent() {
		System.out.println("Adding Some comic scenes");
	}
	
	
}
