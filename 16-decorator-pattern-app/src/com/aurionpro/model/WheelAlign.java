package com.aurionpro.model;

public class WheelAlign extends CarDecorator {

	public WheelAlign(ICarService carObj) {
		super(carObj);
	}
	@Override
	public double getCost() {
		return 900 +super.getCost();
		
	}
}
