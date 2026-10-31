package exceptionHandling.customeException;

import java.util.Scanner;

public class A10_ProductTest {
	public static void main(String[] args) {
		Scanner sc = null;

		try {
			sc = new Scanner(System.in);

			A10_Product p1 = new A10_Product("Laptop", 10);

			System.out.println("Product: " + p1.productName);
			System.out.println("Available Stock: " + p1.quantity);

			System.out.println("Enter quantity to purchase:");
			int q = sc.nextInt();

			p1.purchase(q);
		} catch (A10_OutOfStockException e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}
	}
}