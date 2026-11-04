package Programs;

public class Patient {
	int patientId;
	String patientName;
	int age;
	void displayPatientDetails() {
		System.out.println(patientId);
		System.out.println(patientName);
		System.out.println(age);
	}
	void calculateBill(double consultationFee) {
		System.out.println("Consultation Fee - " +consultationFee);
	}
	void calculateBill(double consultationFee, double medicineCost) {
		System.out.println("Total Consultation Fee and Medicine Cost = " +(consultationFee+medicineCost));
		System.out.println();
	}
}
