package exceptionHandling.customeException;

public class A10_WeakPasswordException extends Throwable {
	@Override
	public String getMessage() {
		return "Password is weak";
	} 
}
