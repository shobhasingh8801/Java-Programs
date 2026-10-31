package exceptionHandling.customeException;

public class A10_OutOfStockException extends Throwable {
	int quantity;

	public A10_OutOfStockException(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String getMessage() {
		return "Out of Stock! Requested quantity: " + quantity;
	}
}
