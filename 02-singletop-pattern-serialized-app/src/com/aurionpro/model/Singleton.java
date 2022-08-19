package com.aurionpro.model;

public class Singleton {
	private static Singleton instance;

	private Singleton() {
		System.out.println("Objet is created" + this.hashCode());
	}

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
