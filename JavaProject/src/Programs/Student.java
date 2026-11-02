package Programs;

public class Student {
	String name;
	String qualification;
	int yop;
	char gender;
	double percentage;
	Student(String name, String qualification, int yop, char gender, double percentage){
		this.name=name;
		this.qualification=qualification;
		this.yop=yop;
		this.gender=gender;
		this.percentage=percentage;
	}
	void display() {
		System.out.println(name+ " "+qualification+" "+yop+" "+gender+" "+percentage);
	}
}
