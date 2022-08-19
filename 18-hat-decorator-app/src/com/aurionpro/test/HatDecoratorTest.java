package com.aurionpro.test;

import com.aurionpro.model.GoldenHat;
import com.aurionpro.model.IHat;
import com.aurionpro.model.RibbonedHat;
import com.aurionpro.model.StandardHat;

public class HatDecoratorTest {

	public static void main(String[] args) {
		IHat hat = new RibbonedHat(new StandardHat());
		System.out.println(hat.getNames());
		System.out.println(hat.getPrice());
		System.out.println(hat.getDescription());
		GoldenHat ghat = new GoldenHat(hat);
		System.out.println(ghat.getNames());
		System.out.println(ghat.getPrice());
		System.out.println(ghat.getDescription());
	}

}
