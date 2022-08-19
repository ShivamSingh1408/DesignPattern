package com.aurionpro.model;

public class ChineseHotel implements IHotel {
	public IMenu getMenu() {
		return new ChineseMenu();
	}
}
