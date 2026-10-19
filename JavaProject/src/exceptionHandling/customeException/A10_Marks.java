package exceptionHandling.customeException;

public class A10_Marks {
	int physics;
	int chemistry;
	int math;
	int biology;
	int optional;

	public A10_Marks(int physics, int chemistry, int math, int biology, int optional) {
		this.physics = physics;
		this.chemistry = chemistry;
		this.math = math;
		this.biology = biology;
		this.optional = optional;
	}

	void percentage() throws A10_InvalidMarksException {

		if (physics <= 0 || physics > 100) {
			throw new A10_InvalidMarksException(physics);
		} else if (chemistry <= 0 || chemistry > 100) {
			throw new A10_InvalidMarksException(chemistry);
		} else if (math <= 0 || math > 100) {
			throw new A10_InvalidMarksException(math);
		} else if (biology <= 0 || biology > 100) {
			throw new A10_InvalidMarksException(biology);
		} else if (optional <= 0 || optional > 100) {
			throw new A10_InvalidMarksException(optional);
		} else {
			int total = physics + chemistry + math + biology + optional;

			double perc = total / 500.0 * 100;

			System.out.println("Total Marks: " + total);
			System.out.println("Percentage: " + perc + "%");
		}
	}
}