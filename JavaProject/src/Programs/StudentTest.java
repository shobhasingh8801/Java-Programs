package Programs;

public class StudentTest {
	public static void main(String[] args) {
		int countMale = 0;
		int countFemale = 0;
		int countMCA2025 = 0;
		int countMCA2026 = 0;
		int countMCA2027 = 0;
		int countBelow = 0;
		int countAbove = 0;
	
		Student s1=new Student("Shobha", "MCA", 2026, 'F', 88.09);
		Student s2=new Student("Arti", "B.tech", 2026, 'F', 80.05);
		Student s3=new Student("Achla", "B.E", 2027, 'F', 60.0);
		Student s4=new Student("Rahul", "MCA", 2023, 'M', 80.0);
		Student s5=new Student("Sonu", "MCA", 2025,'M', 75.0);
		Student s6=new Student("Ram", "MCA", 2026, 'M', 50.0);
		
		System.out.println("=======All Details of student in array=======");
		Student stud[] = {s1, s2,  s3, s4, s5, s6};
		for(int  i=0; i<=stud.length-1; i++) {
			stud[i].display();
		}
		
		System.out.println();
		System.out.println("=======All 2026 Passout Details of student=======");
		for(int  i=0; i<=stud.length-1; i++) {
			if(stud[i].yop == 2026) {
				stud[i].display();
			}
		}
		
		System.out.println();
		System.out.println("=======All Details of student from MCA, B.tech,B.E,2026,2025 only female=======");
		for(int  i=0; i<=stud.length-1; i++) {
			if((stud[i].qualification.equalsIgnoreCase("mca") || (stud[i].qualification.equalsIgnoreCase("B.tech")) || (stud[i].qualification.equalsIgnoreCase("b.e")) 
			&& (stud[i].yop == 2025 || stud[i].yop ==2026) && (stud[i].gender == 'F'))){
				stud[i].display();
			}
		}
		
		System.out.println();
		System.out.println("=======All Details of student from 2023 and 2027 , MCA=======");
		for(int  i=0; i<=stud.length-1; i++) {
			if(stud[i].yop >= 2023 && stud[i].yop <= 2027 && stud[i].qualification.equalsIgnoreCase("mca")) {
				stud[i].display();
			}
		}
		
		System.out.println();
		System.out.println("=======Count of all Male and Female student=======");
		for(int  i=0; i<=stud.length-1; i++) {
			if(stud[i].gender == 'F'){
				countFemale++;
			} else {
				countMale++;
			}
		}
		System.out.println("Male = " +countMale+ ", Female = " +countFemale);
		
		System.out.println();
		System.out.println("=======Count of all 2025 passout and 2026 passout student=======");
		for(int  i=0; i<=stud.length-1; i++) {
			if(stud[i].yop == 2025){
				countMCA2025++;
			} else {
				countMCA2026++;
			}
		}
		System.out.println("2026 Finished = " +countMCA2026+ ", 2025 Finished = " +countMCA2025);
		
		System.out.println();
		System.out.println("=======Count of all 2027 passout=======");
		for(int  i=0; i<=stud.length-1; i++) {
			if(stud[i].yop == 2027){
				countMCA2027++;
			} 
		}
		System.out.println("2027 Finished = " +countMCA2027);
		
		System.out.println();
		System.out.println("=======Count of all 2027 passout=======");
		for(int  i=0; i<=stud.length-1; i++) {
			if(stud[i].percentage > 60){
				countAbove++;
			} else {
				countBelow++;
			}
		}
		System.out.println("Above 60% = " +countAbove+ ", Below 60% = " +countBelow);
	}
	
}

