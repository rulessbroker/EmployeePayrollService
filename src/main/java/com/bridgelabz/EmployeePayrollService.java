package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {

	private List<EmployeePayrollData> employeePayrollList;// declare variable

	public EmployeePayrollService(List<EmployeePayrollData> employeePayrollList) {// Parameterized constructor
		this.employeePayrollList = employeePayrollList;
	}

	public static void main(String[] args) {
		// create Arraylist which is of employee payroll data type
		ArrayList<EmployeePayrollData> employeePayrollList = new ArrayList<>();
		// create object of employee payroll service class using new keyword
		EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollList);// constructor
		Scanner consoleInputReader = new Scanner(System.in);
		employeePayrollService.readEmployeePayrollData(consoleInputReader);// calling read method using obj reference
		employeePayrollService.writeEmployeePayrollData();// calling write method using obj reference
	}

	// Create the Read Employee Payroll Data Method
	private void readEmployeePayrollData(Scanner consoleInputReader) {
		System.out.println("Enter Employee ID: ");
		int id = consoleInputReader.nextInt();
		System.out.println("Enter Employee Name: ");
		String name = consoleInputReader.next();
		System.out.println("Enter Employee Salary: ");
		double salary = consoleInputReader.nextDouble();
		employeePayrollList.add(new EmployeePayrollData(id, name, salary));
	}

	// Create to Write Employee payroll Data Method and passing the message and
	// print employeePayrollList
	
	private void writeEmployeePayrollData() {
		System.out.println("\nWriting Employee Payroll Roaster to Console\n" + employeePayrollList);
	}
}
