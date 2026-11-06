package Programs;

public class P2_Test {
	public static void main(String[] args) {
		Mobile m1 = new Mobile("Apple",329000,8,1000);
		Mobile m2 = new Mobile("Samsung",87000,12,512);
		
		Laptop l1 = new Laptop("Hp", 95000, 16, 512);
		Laptop l2 = new Laptop("Dell", 65000, 8, 512);
		
		Watch w1 = new Watch("Iwatch","Digital",35000);
		Watch w2 = new Watch("Fossil","Analog",65000);
		
		Tv t1 = new Tv("Samsung",55,54000);
		
		P1_Product p[] = {m1,m2,l1,l2,w1,w2,t1};
		for(int i = 0; i <= p.length-1; i++) {
			if(p[i] instanceof Mobile) {
				Mobile m = (Mobile)p[i];
				m.mobileDetails();
			}
			else if(p[i] instanceof Laptop) {
				Laptop l = (Laptop)p[i];
				l.laptopDetails();
			}
			else if(p[i] instanceof Watch) {
				Watch w = (Watch)p[i];
				w.watchDetails();
			}
			else if(p[i] instanceof Tv) {
				Tv t = (Tv)p[i];
				t.tvDetails();
			}
		}
		
	}
}
