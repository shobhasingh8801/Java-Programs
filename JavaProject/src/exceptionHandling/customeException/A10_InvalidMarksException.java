package exceptionHandling.customeException;

public class A10_InvalidMarksException extends Throwable {
	int marks;

	public A10_InvalidMarksException(int marks) {
		this.marks = marks;
	}

	@Override
	public String getMessage() {
		return "Marks is Invalid: " + marks;
	}
}