package Programs;

public class P3_LaptopTest {
	public static void main(String[] args) {
		P1_Laptop p1 = P2_LaptopFactory.getLaptop("Hp");
		if(p1 != null) {
			if(p1 instanceof Hp) {
				Hp h1 = (Hp)p1;
				h1.hpDetails();
			}
			else if(p1 instanceof Dell) {
				Dell d1 = (Dell)p1;
				d1.dellDetails();
			}
			else {
				Lenovo l1 = (Lenovo)p1;
				l1.lenovoDetails();
			}
		}
		else {
			System.out.println("Laptop not Available");
		}
	}
}
