package exceptionHandling.customeException;

public class A10_InvalidAgeException extends Throwable {
	@Override
	public String getMessage() {
		return "You are not eligible to cast the Vote";
	}
}
