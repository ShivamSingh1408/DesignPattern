package com.aurionpro.model;

public class Employee {
	public int id;
	public String name;
	public IRole role;

	public Employee(int id, String name, IRole role) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
	}

	public void promote(IRole role) {
		this.role = role;
	}

	public String getDescription() {
		return role.description();
	}

	public String getResponsibility() {
		return role.responsibility();
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", role=" + role.getClass().getSimpleName() + "]";
	}
}
