package com.aurionpro.model;

public class MarutiFactory implements IAutomobileFactory {
	static MarutiFactory instance;

	private MarutiFactory() {
	}

	public static MarutiFactory getInstance() {
		if (instance == null) {
			instance = new MarutiFactory();
		}
		return instance;
	}

	public IAutomobile makeAutoMobile() {
		return new Maruti();
	}
}
