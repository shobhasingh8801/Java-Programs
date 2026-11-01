package Programs;

public class P1_Laptop {
	String model;
	int price;
}
class Hp extends P1_Laptop{
	{
		model = "HP15s";
		price = 55000;
	}
	void hpDetails() {
		System.out.println("==========HP==========");
		System.out.println("Model = " +model);
		System.out.println("Price = " +price);
	}
}
class Dell extends P1_Laptop{
	{
		model = "Inspiron15";
		price = 51000;
	}
	void dellDetails() {
		System.out.println("==========DELL==========");
		System.out.println("Model = " +model);
		System.out.println("Price = " +price);
	}
}
class Lenovo extends P1_Laptop{
	{
		model = "IdeaPadSlim3";
		price = 45000;
	}
	void lenovoDetails() {
		System.out.println("==========Lenovo==========");
		System.out.println("Model = " +model);
		System.out.println("Price = " +price);
	}
}

