package Programs;

public class Bike {
	String model;
	String color;
	int price;
	Bike(String m, String c, int p){
		 model = m;
		 color = c;
		 price = p;
	}
	void bikeDetails() {
		System.out.println(model+" "+color+" "+price);
	}
}

