package Programs;

public class Laptop1 {
	public static void main(String[] args) {
		Laptop2 l1 = new Laptop2("Hp","Silver",55000,"8Gb","512Gb");
		Laptop2 l2 = new Laptop2("Dell","Black",16500,"12Gb","612Gb");
		Laptop2 l3 = new Laptop2("Acer","White",45000,"4Gb","512Gb");
		Laptop2 l4 = new Laptop2("Hp","Silver",80000,"2Gb","512Gb");
		Laptop2 l5 = new Laptop2("Dell","Red",110000,"8Gb","612Gb");
		
		Laptop2 l[] = {l1,l2,l3,l4,l5};
		
		for(int i = 0; i <= l.length-1; i++) {
			l[i].laptopDetails();
		}
		System.out.println();
		System.out.println("===============8GB Ram Varient Only================");
		for(int i = 0; i <= l.length-1; i++) {
			if(l[i].ram.equalsIgnoreCase("8gb")) {
				l[i].laptopDetails();
			}
		}
		System.out.println();
		System.out.println("======================512GB Memory Varients Only====================");
		for(int i = 0; i <= l.length-1; i++){
			if(l[i].memory.equalsIgnoreCase("512gb")) {
				l[i].laptopDetails();
			}
		}
		System.out.println();
		System.out.println("======================All HP Laptop=======================");
		for(int i = 0; i <= l.length-1; i++) {
			if(l[i].brand.equalsIgnoreCase("hp")) {
				l[i].laptopDetails();
			}
		}
		System.out.println();
		System.out.println("========================All DEll Laptop======================");
		for(int i = 0; i <= l.length-1; i++) {
			if(l[i].brand.equalsIgnoreCase("dell")) {
				l[i].laptopDetails();
			}
		}
		System.out.println();
		System.out.println("========================Pricing Between 45K to 70K======================");
		for(int i = 0; i <= l.length-1; i++) {
			if(l[i].price >= 45000 && l[i].price <= 70000) {
				l[i].laptopDetails();
			}
		}
		System.out.println();
		System.out.println("===========================Pricing above 100000, HP, or DELL Only====================");
		for(int i = 0; i <= l.length-1; i++) {
			if(l[i].price > 100000 &&
			  (l[i].brand.equalsIgnoreCase("hp") ||
			   l[i].brand.equalsIgnoreCase("dell"))){
			   l[i].laptopDetails();
			}
		}
		System.out.println();
		System.out.println("========================Min 8GB Ram with Min 512Gb Memory=======================");
		for(int i = 0; i <= l.length-1; i++) {
			if(l[i].ram.equalsIgnoreCase("8gb") && l[i].memory.equalsIgnoreCase("512gb")) {
				l[i].laptopDetails();
			}
		}
	}
}

