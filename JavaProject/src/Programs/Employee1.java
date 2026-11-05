package Programs;

public class Employee1 {
	int employeeId;
	String employeeName;
	double basicSalary;
	void displayEmployeeDetails() {
		System.out.println(employeeId);
		System.out.println(employeeName);
		System.out.println(basicSalary);
	}
	void calculateSalary(double basicSalary) {
		System.out.println("Basic Salary = " +basicSalary);
	}
	void calculateSalary(double basicSalary, double bonus) {
		System.out.println("With Increment =" +(basicSalary+basicSalary*bonus/100.0));
		System.out.println();
	}
}

