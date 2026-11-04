package Programs;

public class OutPatient extends Patient{
	String appointmentDate;
	String doctorName;
	public OutPatient(int patientId, String patientName, int age, String appointmentDate, String doctorName) {
		this.patientId=patientId;
		this.patientName=patientName;
		this.age=age;
		this.appointmentDate=appointmentDate;
		this.doctorName=doctorName;
	}
	void displayOutPatientDetails() {
		displayPatientDetails();
		System.out.println("Appointment Date - " +appointmentDate);
		System.out.println("Doctor Name - " +doctorName);
	}
	public static void main(String[] args) {
		OutPatient op1 = new OutPatient(101,"Smith",40,"12-jul-2025","Dr.Sameer");
		OutPatient op2 = new OutPatient(102,"Turner",50,"10-mar-2024","Dr.Manoj");
		op1.displayOutPatientDetails();
		op1.calculateBill(300.0);
		op1.calculateBill(300.0,5000.50);
		op2.displayOutPatientDetails();
		op2.calculateBill(200.0);
		op2.calculateBill(200.0,10000.50);
	}
}
