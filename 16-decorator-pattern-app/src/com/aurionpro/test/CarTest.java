package com.aurionpro.test;

import com.aurionpro.model.CarService;
import com.aurionpro.model.OilChange;
import com.aurionpro.model.WheelAlign;

public class CarTest {

	public static void main(String[] args) {
		CarService car = new CarService();
		OilChange carOilObj = new OilChange(car);
		WheelAlign wheelObj = new WheelAlign(carOilObj);
		System.out.println(wheelObj.getCost());
	}

}
