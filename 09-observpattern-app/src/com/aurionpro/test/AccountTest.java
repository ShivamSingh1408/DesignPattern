package com.aurionpro.test;

import com.aurionpro.model.Account;
import com.aurionpro.model.EmailNotifier;
import com.aurionpro.model.SmsNotifier;

public class AccountTest {

	public static void main(String[] args) {
		Account acc = new Account(101, "Shubh", 1000);
		acc.registerNotifier(new SmsNotifier());
		acc.deposit(1000);
		
		acc.registerNotifier(new EmailNotifier());
		acc.withdraw(100);
	
	}

}
