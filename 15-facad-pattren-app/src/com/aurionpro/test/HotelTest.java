package com.aurionpro.test;

import com.aurionpro.model.HotelReception;

public class HotelTest {

	public static void main(String[] args) {
	HotelReception rec = new HotelReception();
	rec.getIndianMenu();
	System.out.println("---------------------");
	rec.getChineseMenu();
	System.out.println("---------------------");
	rec.getItalianMenu();
	}

}
