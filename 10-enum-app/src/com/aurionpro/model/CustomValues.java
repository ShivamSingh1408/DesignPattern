package com.aurionpro.model;

interface College {
	public void Collegename();
}

enum EngineeringBranch implements College {
	CS("Computer Science"), MECH("Mechanics"), IT("Information Technology"), EXTC("Electronics and TeleCommunication");

	private String BranchName;

	private EngineeringBranch(String branchName) {
		this.BranchName = branchName;
	}

	public String getBranchName() {
		return BranchName;
	}

	@Override
	public void Collegename() {
		System.out.println("College Name is LTCE");
	}

}

public class CustomValues {

	public static void main(String[] args) {
		EngineeringBranch[] eb= EngineeringBranch.values();
		System.out.println();
		for (EngineeringBranch e : eb) {
			System.out.println(
					"Branch : " + e + "\tBrach Name : " + e.getBranchName() + " \t\rAt index : " + e.ordinal());
			System.out.println("--------------------------");
		}
	
		// using values of
		EngineeringBranch eb1 = EngineeringBranch.valueOf("CS");
		System.out.println("Branch Passed as String : " + eb1.getBranchName());
		eb1.Collegename();
	}

}
