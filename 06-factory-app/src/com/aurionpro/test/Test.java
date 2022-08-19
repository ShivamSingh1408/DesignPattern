package com.aurionpro.test;

import com.aurionpro.model.AutoType;
import com.aurionpro.model.AutomobileFactory;
import com.aurionpro.model.IAutomobile;

public class Test {

	public static void main(String[] args) {
		AutomobileFactory automobile = new AutomobileFactory();
		IAutomobile bmw = automobile.makeAutoMobile(AutoType.BMW);
		bmw.start();
		bmw.stop();
		
		IAutomobile tesla = automobile.makeAutoMobile(AutoType.TESLA);
		tesla.start();
		tesla.stop();
		
		IAutomobile maruti = automobile.makeAutoMobile(AutoType.MARUTI);
		maruti.start();
		maruti.stop();
	}

}
