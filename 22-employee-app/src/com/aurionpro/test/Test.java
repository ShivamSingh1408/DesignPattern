package com.aurionpro.test;

import com.aurionpro.model.Consultant;
import com.aurionpro.model.Employee;
import com.aurionpro.model.SeniorConsultant;

public class Test {

	public static void main(String[] args) {
		Employee employee = new Employee(101, "Shivam", new Consultant());
		System.out.println(employee);
		System.out.println("Role: "+employee.getDescription());
		System.out.println("Responsibility: "+employee.getResponsibility());
		System.out.println("----------------------------------------");
		
		employee.promote(new SeniorConsultant());
		System.out.println(employee);
		System.out.println("Role: "+employee.getDescription());
		System.out.println("Responsibility: "+employee.getResponsibility());
		
	}

}
