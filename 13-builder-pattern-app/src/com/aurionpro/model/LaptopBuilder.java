package com.aurionpro.model;

public class LaptopBuilder {
	Laptop laptop;

	public  LaptopBuilder() {
		laptop = new Laptop();
	}
	
	public LaptopBuilder addRam(String ram) {
		laptop.setRam(ram);
		return this;
	}
	public LaptopBuilder addHdd(String hdd) {
		laptop.setHdd(hdd);
		return this;
	}
	public LaptopBuilder addKeyBoard(String keyBoard) {
		laptop.setKeyboard(keyBoard);
		return this;
	}
	public LaptopBuilder addMouse(String mouse) {
		laptop.setMouse(mouse);
		return this;
	}
	public LaptopBuilder addTouchScreen(Boolean touchScreen) {
		laptop.setTouchScreen(touchScreen);
		return this;
	}
	public Laptop getLaptop() {
		return laptop;
	}
}
