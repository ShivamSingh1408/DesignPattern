package com.aurionpro.model;

public class BMWFactory implements IAutomobileFactory {
	static BMWFactory instance;

	private BMWFactory() {
	}

	public static BMWFactory getInstance() {
		if (instance == null) {
			instance = new BMWFactory();
		}
		return instance;
	}

	public IAutomobile makeAutoMobile() {
		return new BMW();
	}
}
