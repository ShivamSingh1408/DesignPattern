package com.aurionpro.test;

import com.aurionpro.model.BMWFactory;
import com.aurionpro.model.IAutomobile;
import com.aurionpro.model.IAutomobileFactory;
import com.aurionpro.model.MarutiFactory;
import com.aurionpro.model.TeslaFactory;

public class Test {

	public static void main(String[] args) {
		IAutomobileFactory factory = BMWFactory.getInstance();
		IAutomobile BMW = factory.makeAutoMobile();
		BMW.start();
		BMW.stop();
		
		IAutomobileFactory factory1 = TeslaFactory.getInstance();
		IAutomobile tesla = factory1.makeAutoMobile();
		tesla.start();
		tesla.stop();
		
		IAutomobileFactory factory2 = MarutiFactory.getInstance();
		IAutomobile maruti =factory2.makeAutoMobile();
		maruti.start();
		maruti.stop();
	}

}
