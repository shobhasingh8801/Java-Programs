package Programs;

public class Test1 {
	public static void main(String[] args) {
		Bike b1 = new Bike("Duke","Orange",275000);
		Bike b2 = new Bike("Z900","Green",1565000);
		Bike b3 = new Bike("MT-15","Red",225000);
		Bike b4 = new Bike("R15","Black",245000);
		Bike b5 = new Bike("Hayabusa","Blue",2750000);
		
		Bike b[] = {b1,b2,b3,b4,b5};
		
		for(int i = 0; i <= b.length-1; i++) {
			b[i].bikeDetails();
		}
		System.out.println("===============Under 5 lakhs================");
		for(int i = 0; i <= b.length-1; i++) {
			if(b[i].price<500000) {
				b[i].bikeDetails();
			}
		}
	}
}