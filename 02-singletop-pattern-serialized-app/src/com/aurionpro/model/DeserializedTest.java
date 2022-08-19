package com.aurionpro.model;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializedTest {

	public static void main(String[] args) throws Exception {
		Singleton st1 = Singleton.getInstance();
		Singleton st2 = Singleton.getInstance();
		FileInputStream file = new FileInputStream("./lib/test.bin");
		ObjectInputStream in = new ObjectInputStream(file);
		st1 = (Singleton) in.readObject();//deserialization
		in.close();
		file.close();
	}

}
