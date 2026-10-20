package exceptionHandling.customeException;
import java.util.Scanner;

public class A10_PasswordTest {
	public static void main(String[] args) {
		Scanner sc = null;
		
		try {
			sc = new Scanner(System.in);
			System.out.println("Enter Password");
			String p = sc.next();
			A10_Password p1 = new A10_Password(p);
			p1.isValidPassword();
		}
		catch(Throwable e) {
			System.out.println(e.getMessage());
		}
		finally {
			sc.close();
		}
	}
}
