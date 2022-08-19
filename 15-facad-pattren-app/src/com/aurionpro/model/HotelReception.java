package com.aurionpro.model;

public class HotelReception {
	public void getIndianMenu() {
		IHotel indHotel = new IndianHotel();
		IMenu indMenu = indHotel.getMenu();
		indMenu.showMenu();
	}
	
	public void getItalianMenu() {
		IHotel itaHotel = new ItalianHotel();
		IMenu itaMenu = itaHotel.getMenu();
		itaMenu.showMenu();
	}
	
	public void getChineseMenu() {
		IHotel chiHotel = new ChineseHotel();
		IMenu chiMenu = chiHotel.getMenu();
		chiMenu.showMenu();
	}
}
