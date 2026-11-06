package Programs;

public class Test {
	public static void main(String[] args) {
		Employee2 e1 = new Employee2("Mahesh", "Kpmg", "Service", 75000);
		Employee2 e2 = new Employee2("Suresh", "Oracle", "Product", 105000);
		Employee2 e3 = new Employee2("Ganesh", "Walmart", "Product", 165000);
		Employee2 e4 = new Employee2("Rajesh", "Infosys", "Service", 45000);
		Employee2 e5 = new Employee2("Ramesh", "TCS", "Service", 36000);
		
		System.out.println();
		System.out.println("=======All employee present in array=======");
		Employee2 emp[] = {e1, e2,  e3, e4, e5};
		for(int  i=0; i<=emp.length-1; i++) {
			emp[i].display();
		}
		System.out.println();
		System.out.println("=======Employee in service based company=======");
		for(int i=0; i<=emp.length-1; i++) {
			if(emp[i].companyType.equalsIgnoreCase("service")) {
				emp[i].display();
			}
		}
		System.out.println();
		System.out.println("=======Employee who is earnign between 35000 to 50000=======");
		for(int i=0; i<=emp.length-1; i++) {
			if(emp[i].salary>35000 && emp[i].salary<50000) {
				emp[i].display();
			}
		}
		System.out.println();
		System.out.println("=======Employee who is working for Infosys=======");
		for(int i=0; i<=emp.length-1; i++) {
			if(emp[i].company.equalsIgnoreCase("infosys")) {
				emp[i].display();
			}
		}
	}
}

