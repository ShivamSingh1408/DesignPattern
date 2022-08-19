package com.aurionpro.model;

public class RibbonedHat extends HatDecorator{

	public RibbonedHat(IHat hat) {
		super(hat);
	}

	@Override
	public String getNames() {
		return "Ribboned "+ super.getNames();
	}

	@Override
	public double getPrice() {
		return 700+super.getPrice();
	}

	@Override
	public String getDescription() {
		return "I'm a Ribboned Hat";
	}

}
