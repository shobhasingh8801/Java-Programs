package Programs;

public class Employee {

	public static void main(String[] args) {
		System.out.println("Main-1");
		main();
		main(100);
	}
	public static void main() {
		System.out.println("Main-2");
	}
	public static void main(int i) {
		System.out.println("Main-3");
	}

}

