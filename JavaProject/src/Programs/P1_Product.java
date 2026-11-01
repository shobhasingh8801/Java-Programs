package Programs;

public class P1_Product {
	int price;
	P1_Product(int price){
		this.price=price;
	}
	void productDetails() {
		System.out.println("Price = " +price);
	}
}
class Gadget extends P1_Product{
	String model;
	Gadget(String m, int p){
		super(p);
		this.model=m;
	}
	void gadgetDetails() {
		System.out.println("Model = " +model);
		super.productDetails();
	}
}
class Egadget extends Gadget{
	int ram;
	int memory;
	Egadget(String m, int p, int r, int me){
		super(m,p);
		this.ram = r;
		this.memory = me;
	}
	void egadgetDetails() {
		super.gadgetDetails();
		System.out.println("Ram = " +ram+"GB");
	}
}
class Laptop extends Egadget{
	Laptop(String m, int p, int r, int me){
		super(m,p,r,me);
	}
	void laptopDetails() {
		super.egadgetDetails();
		System.out.println();
	}
}
class Watch extends Gadget{
	String type;
	Watch(String m, String t, int p){
		super(m,p);
		this.type = t;
	}
	void watchDetails() {
		System.out.println("Type = " +type);
		super.gadgetDetails();
		System.out.println();
	}
}
class Mobile extends Egadget{
	Mobile(String m, int p, int r, int me){
		super(m,p,r,me);
	}
	void mobileDetails() {
		super.egadgetDetails();
		System.out.println();
	}
}
class Tv extends P1_Product{
	String brand;
	int size;
	Tv(String b, int s, int p){
		super(p);
		this.brand = b;
		this.size = s;
	}
	void tvDetails() {
		System.out.println("Brand = " +brand);
		System.out.println("Size = " +size);
		super.productDetails();
	}
}