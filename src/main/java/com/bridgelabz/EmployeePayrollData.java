package com.bridgelabz;

public class EmployeePayrollData {

	private int id;
	private String name;
	private double salary;

	EmployeePayrollData(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeePayrollData\n [id=" + id + "\nname=" + name + "\nsalary=" + salary + "]";
	}

}
