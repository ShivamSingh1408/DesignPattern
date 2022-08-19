package com.aurionpro.test;

import com.aurionpro.model.CarBrandFactory;
import com.aurionpro.model.ICarBrand;

public class FactoryTest {

	public static void main(String[] args) {
		CarBrandFactory cbf = new CarBrandFactory();
		ICarBrand cb = cbf.getCarBrand("Bmw");
		cb.carManufacturer();
		System.out.println("-----------------------------");
		ICarBrand cb1 = cbf.getCarBrand("TATA");
		cb1.carManufacturer();
		System.out.println("-----------------------------");
		ICarBrand cb2 = cbf.getCarBrand("Jaguar");
		cb2.carManufacturer();

	}

}
