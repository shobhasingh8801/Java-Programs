package Programs;

public class Developer extends Employee1 {
	String programmingLanguage;
	int experience;
	Developer(int employeeId, String employeeName, double basicSalary, String programmingLanguage, int experience) {
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.basicSalary=basicSalary;
		this.programmingLanguage=programmingLanguage;
		this.experience=experience;
	}
	void displayDeveloperDetails() {
		displayEmployeeDetails();
		System.out.println("Programmin-Language - " +programmingLanguage);
		System.out.println("Experience - " +experience);
		System.out.println();
	}
	public static void main(String[] args) {
		Developer d1 = new Developer(101,"Shobha",50000.0,"Java",2);
		Developer d2 = new Developer(102,"Rahul",60000.0,"C++",3);
		d1.displayDeveloperDetails();
		d1.calculateSalary(50000.0);
		d1.calculateSalary(50000.0, 10);
		d2.displayDeveloperDetails();
		d2.calculateSalary(60000.0);
		d2.calculateSalary(60000.0,20);	
	}
}

