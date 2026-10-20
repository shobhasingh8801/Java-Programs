package exceptionHandling.customeException;

public class A10_Password {
	String password;
	
	public A10_Password(String password) {
		this.password = password;
	}
	
	void isValidPassword() throws A10_WeakPasswordException {
		if(password.length() >= 8) {
			System.out.println("Password Accepted");
		} else {
			throw new A10_WeakPasswordException();
		}
	}
}
