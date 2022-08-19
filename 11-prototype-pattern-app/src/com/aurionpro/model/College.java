package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class College implements Cloneable {
	private List<String> collegeList;

	public College() {
		this.collegeList = new ArrayList<String>();
	}

	public College(List<String> list) {
		this.collegeList = list;
	}

	public List<String> getCollegeList() {
		return collegeList;
	}

	public void insertData() { 
		collegeList.add("LTCOE");
		collegeList.add("RAIT");
		collegeList.add("TERNA");
		collegeList.add("THAKUR");
		collegeList.add("VIDYALANKAR");

	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		List<String> tempList = new ArrayList<String>();
		
		for(String s : this.collegeList) {
			tempList.add(s);
		}
		return new College(tempList); 
	}
}
