package com.aurionpro.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Singleton implements Serializable {
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

	private Object readResolve() {
		return instance;
	}
}
