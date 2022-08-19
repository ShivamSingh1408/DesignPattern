package com.aurionpro.model;

public class ItalianHotel implements IHotel {
	public IMenu getMenu() {
		return new ItalianMenu();
	}
}
