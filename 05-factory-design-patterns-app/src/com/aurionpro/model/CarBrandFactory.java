package com.aurionpro.model;

public class CarBrandFactory {

	public ICarBrand getCarBrand(String str) {

		if (str.equalsIgnoreCase("BMW")) {
			return new BMW();

		} else if (str.equalsIgnoreCase("TATA")) {
			return new TATA();

		} else if (str.equalsIgnoreCase("JAGUAR")) {
			return new Jaguar();
		}
		return null;
	}

}
