package com.aurionpro.test;

import com.aurionpro.model.Laptop;
import com.aurionpro.model.LaptopBuilder;

public class LaptopTest {

	public static void main(String[] args) {
		Laptop laptop = new LaptopBuilder().addHdd("1TB").addMouse("Gaming").addKeyBoard("Mechanical").addTouchScreen(true).getLaptop();
		System.out.println(laptop);
	}

}
