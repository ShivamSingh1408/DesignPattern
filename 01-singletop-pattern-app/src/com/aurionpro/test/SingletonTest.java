package com.aurionpro.test;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import com.aurionpro.model.Singleton;

public class SingletonTest {

	public static void main(String[] args) throws Exception {
		Singleton st1 = Singleton.getInstance();
		Singleton st2 = Singleton.getInstance();
		
		FileOutputStream file = new FileOutputStream("./lib/test.bin");	
		ObjectOutputStream out = new ObjectOutputStream(file);
		out.writeObject(st1.hashCode());
		out.close();
		file.close();
//		Singleton st1 = Singleton.getInstance();
//		Singleton st2 = Singleton.getInstance();
//		System.out.println(st1.hashCode());
//		System.out.println(st2.hashCode());
	}

}
