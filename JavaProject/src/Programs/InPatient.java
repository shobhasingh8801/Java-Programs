package Programs;

public class InPatient extends Patient{
	int roomNumber;
	int numberOfDays;
	public InPatient(int patientId, String patientName, int age, int roomNumber, int numberOfDays) {
		this.patientId=patientId;
		this.patientName=patientName;
		this.age=age;
		this.roomNumber=roomNumber;
		this.numberOfDays=numberOfDays;
	}
	void displayInPatientDetails() {
		displayPatientDetails();
		System.out.println("Room-Number - " +roomNumber);
		System.out.println("Number Of Days - " +numberOfDays);
	}
	public static void main(String[] args) {
		InPatient ip1 = new InPatient(101,"Raj",30,202,10);
		InPatient ip2 = new InPatient(102,"Rani",20,101,5);
		ip1.displayInPatientDetails();
		ip1.calculateBill(300.0);
		ip1.calculateBill(300.0,5000.50);
		ip2.displayInPatientDetails();
		ip2.calculateBill(200.0);
		ip2.calculateBill(200.0,10000.50);
	}
}
