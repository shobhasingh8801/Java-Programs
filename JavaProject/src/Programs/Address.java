package Programs;

public class Address {
	String street;
	String area;
	String city;
	int pin;
	Address(String street, String area, String city, int pin){
		this.street=street;
		this.area=area;
		this.city=city;
		this.pin=pin;
	}
	void display() {
		System.out.println("Street = " +street);
		System.out.println("Area = " +area);
		System.out.println("City = " +city);
		System.out.println("PIn = " +pin);
	}
}

