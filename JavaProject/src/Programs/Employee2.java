package Programs;

public class Employee2 {
	String name;
	String company;
	String companyType;
	double salary;
	Employee2(String n, String c, String ct, double s){
		this.name=n;
		this.company=c;
		this.companyType=ct;
		this.salary=s;
	}
	void display() {
		System.out.println(name+ " "+company+" "+companyType+" "+salary);
	}
}
