package com.bridgelabz;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class EmployeePayrollFileIOService {
	private static String FILE_PATH = "F:\\Languages\\Java\\Employee_Payroll\\lib\\src\\main\\resources\\payroll-file.txt";

	// write employee payroll date method
	public void writeData(List<EmployeePayrollData> employeeList) {
		StringBuffer employeeBuffer = new StringBuffer();
		employeeList.forEach(employee -> {
			String employeeString = employee.toString().concat("\n");
			employeeBuffer.append(employeeString);
		});
		try {
			Files.write(Paths.get(FILE_PATH), employeeBuffer.toString().getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
