package exceptionHandling.customeException;

public class A10_Product {
	String productName;
	int quantity;

	public A10_Product(String productName, int quantity) {
		this.productName = productName;
		this.quantity = quantity;
	}

	void purchase(int quantity) throws A10_OutOfStockException {
		if (quantity > this.quantity) {
			throw new A10_OutOfStockException(quantity);
		} else {
			this.quantity = this.quantity - quantity;

			System.out.println("Purchase Successful");
			System.out.println("Product Name: " + productName);
			System.out.println("Remaining Stock: " + this.quantity);
		}
	}
}