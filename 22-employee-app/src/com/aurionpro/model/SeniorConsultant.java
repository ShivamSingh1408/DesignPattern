package com.aurionpro.model;

public class SeniorConsultant implements IRole{

	@Override
	public String description() {
		return  "I'm Senior consultant";
	}

	@Override
	public String responsibility() {
		return "I'm handling some consultant as well as client";
	}

}
