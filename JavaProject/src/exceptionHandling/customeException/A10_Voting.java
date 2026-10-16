package exceptionHandling.customeException;

public class A10_Voting {
	String name;
	int age;
	
	public A10_Voting(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void isEligibleToVote() throws A10_InvalidAgeException {
		if(age >= 18) {
			System.out.println(name + " is eligible for voting");
		} else {
			throw new A10_InvalidAgeException();
		}
	}
}
