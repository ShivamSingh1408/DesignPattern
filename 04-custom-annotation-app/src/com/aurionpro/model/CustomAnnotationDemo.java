package com.aurionpro.model;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@BingeWatch( rating = 8.5)
class NetflixSeries {
	String genres;
	double length;

	public NetflixSeries(String genres, double length) {
		this.genres = genres;
		this.length = length;
	}

}

class Reflection {

	public static void getReflectionData(Class className) {
		System.out.print("\nClass Name is : " + className.getName());
		Method[] methods = className.getDeclaredMethods();
		System.out.println("\nMethods of :*** " + className.getName() + " *** are :\n");
		for (Method m : methods) {
			System.out.println("Method Name: " + m);
		}
	}

}

public class CustomAnnotationDemo {
	public static void main(String args[]) {
		NetflixSeries obj = new NetflixSeries("Thriller", 9.2);
		Class c = obj.getClass();
		Annotation an = c.getAnnotation(BingeWatch.class);
		BingeWatch bw = (BingeWatch) an;
		System.out.println(bw.seriesName());
		Reflection obj1 = new Reflection();
		obj1.getReflectionData(BingeWatch.class);

	}

}
