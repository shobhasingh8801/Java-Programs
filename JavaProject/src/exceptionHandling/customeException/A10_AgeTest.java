package exceptionHandling.customeException;
import java.util.Scanner;

public class A10_AgeTest {
	public static void main(String[] args) {
		Scanner sc = null;
		
		try {
			sc = new Scanner(System.in);
			System.out.println("Enter Name");
			String n = sc.nextLine();
			System.out.println("Enter Age");
			int a = sc.nextInt();
			A10_Voting v1 = new A10_Voting(n,a);
			v1.isEligibleToVote();
		}
		catch(Throwable e) {
			System.out.println(e.getMessage());
		}
		finally {
			sc.close();
		}
	}
}
