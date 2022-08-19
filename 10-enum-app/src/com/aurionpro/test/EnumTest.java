package com.aurionpro.test;

import com.aurionpro.model.Holidays;

public class EnumTest {

	public static void main(String[] args) {
//		String hd = Holidays.HOLI.HolidayIsIn();
//		System.out.println(hd);
//
//		String hd1 = Holidays.DUSSEHRA.HolidayIsIn();
//		System.out.println(hd1);
//		
//		String hd2 = Holidays.GANESHCHATURTHI.HolidayIsIn();
//		System.out.println(hd2);
//		
//		String hd3 = Holidays.CHRISTMAS.HolidayIsIn();
//		System.out.println(hd3);
//		
//		String hd4 = Holidays.OTHER.HolidayIsIn();
//		System.out.println(hd4);

		Holidays hd = Holidays.DIWALI;
		if (hd == Holidays.HOLI) {
			System.out.println("I'm in month of March");
		} else if (hd == Holidays.EID) {
			System.out.println("I'm in month of May");
		} else if (hd == Holidays.INDEPENDENCEDAY) {
			System.out.println("I'm in month of August");
		} else if (hd == Holidays.GANESHCHATURTHI) {
			System.out.println("I'm in month of August");
		} else if (hd == Holidays.DUSSEHRA) {
			System.out.println("I'm in month of October");
		} else if (hd == Holidays.DIWALI) {
			System.out.println("I'm in month of October");
		} else if (hd == Holidays.CHRISTMAS) {
			System.out.println("I'm in month of December");
		} else {
			System.out.println("Happy to have Holidays");
		}

	}

}
