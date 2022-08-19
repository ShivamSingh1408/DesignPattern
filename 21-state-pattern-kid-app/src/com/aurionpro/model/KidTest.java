package com.aurionpro.model;

public class KidTest {

	public static void main(String[] args) {
		Kid kid = new Kid(2);
		kid.eat();
		kid.play();
		System.out.println("------------------------");
		kid.setAge(4);
		kid.eat();
		kid.play();
	}

}
