package com.aurionpro.test;

import java.util.List;

import com.aurionpro.model.College;

public class CollegeTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		College a = new College();
		a.insertData();
		
		College b = (College) a.clone();
		List<String> list = b.getCollegeList();
		list.add("VJTI");
		
		System.out.println(a.getCollegeList());
		System.out.println(list);
		
		b.getCollegeList().remove("THAKUR");
		System.out.println(list);
		System.out.println(a.getCollegeList());

	}
}
