package Programs;

public class P2_LaptopFactory {
	static P1_Laptop getLaptop(String input) {
		if(input.equalsIgnoreCase("hp")) {
			return new Hp();
		}
		else if(input.equalsIgnoreCase("dell")) {
			return new Dell();
		}
		else if(input.equalsIgnoreCase("lenovo")) {
			return new Lenovo();
		}
		else {
			return null;
		}
	}
}
