package com.aurionpro.model;

public class GoldenHat extends HatDecorator{

	public GoldenHat(IHat hat) {
		super(hat);
	}

	@Override
	public String getNames() {
		return"Golden "+ super.getNames();
	}

	@Override
	public double getPrice() {
		return 2000+super.getPrice();
	}

	@Override
	public String getDescription() {
		return "I'm a Golden Hat";
	}


}
