package com.aurionpro.model;

public class IndianHotel implements IHotel {

	public IMenu getMenu() {
		return new IndianMenu();
	}

}
