package Programs;

public class Laptop2 {
	String brand;
	String color;
	int price;
	String ram;
	String memory;
	Laptop2(String b, String c, int p, String r, String m){
		brand = b;
		color = c;
		price = p;
		ram = r;
		memory = m;
	}
	void laptopDetails() {
		System.out.println(brand+" "+color+" "+price+" "+ram+" "+memory);
	}
}
