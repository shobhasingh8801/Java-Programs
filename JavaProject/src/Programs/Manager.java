package Programs;

public class Manager extends Employee1{
	String department;
	int teamSize;
	Manager(int employeeId, String employeeName, double basicSalary, String department, int teamSize){
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.basicSalary=basicSalary;
		this.department=department;
		this.teamSize=teamSize;
	}
	void displayManagerDetails() {
		displayEmployeeDetails();
		System.out.println("Department - " +department);
		System.out.println("Team-Size - " +teamSize);
		System.out.println();
	}
	public static void main(String[] args) {
		Manager m1 = new Manager(101,"Shobha",50000.0,"Manager",20);
		Manager m2 = new Manager(102,"Rahul",60000.0,"AVP",30);
		m1.displayManagerDetails();
		m1.calculateSalary(50000.0);
		m1.calculateSalary(50000.0,10);
		m2.displayManagerDetails();
		m2.calculateSalary(60000.0);
		m2.calculateSalary(60000.0,20);
	}
}
