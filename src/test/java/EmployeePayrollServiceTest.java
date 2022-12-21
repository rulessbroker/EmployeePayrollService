import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.bridgelabz.EmployeePayrollData;
import com.bridgelabz.EmployeePayrollService;

class EmployeePayrollServiceTest {

	@Test
	public void givenThreeEmployees_WhenWrittenToFile_ShouldMatch_EmployeeEntries() {
		EmployeePayrollData[] employeePayrollList = { new EmployeePayrollData(1, "Jeff Bezos", 100000.0),
				new EmployeePayrollData(2, "Bill Gates", 200000.0),
				new EmployeePayrollData(3, "Mark Zukerberg", 300000.0) };
		EmployeePayrollService employeePayrollService = new EmployeePayrollService(Arrays.asList(employeePayrollList));
		employeePayrollService.writeEmployeePayrollData(EmployeePayrollService.IOService.FILE_IO);
		long entries = employeePayrollService.countEntries();
		Assertions.assertEquals(3, entries);
	}

}
