package undiksha.ac.id;
import id.ac.undiksha.siak.entities.*;
//import id.ac.undiksha.siak.entities.Lecture;
//import id.ac.undiksha.siak.entities.Staff;
//import id.ac.undiksha.siak.entities.Person;


public class Main {

	public static void main(String[] args) {
		
//		student1
//		System.out.println("Student-01");
//		Student stdn1 = new Student();
//		stdn1.setNim("2115101013");
//		stdn1.setName("Darmawan Jiddan");
//		stdn1.setAddress("Jln Gunung Semeru");
//		stdn1.setGender(true);
//		stdn1.setStudyProgram("Computer Science");
//		stdn1.setDepartement("Technical Information");
//		stdn1.setFaculty("Technical & Vocational");
//		stdn1.printAllInfo();
		
//		
//		//student2
//		System.out.println("Student-02");
//		Student stdn2 = new Student(
//			"2115101027",
//			"Joe Aqilla Vandyta",
//			"Jln Raya Sangsit",
//			true,
//			"Computer Science",
//			"Technical Information",
//			"Technical & Vocational"
//		);
//		stdn2.printAllInfo();
//
//		
//		//lecture
//		System.out.println("Lecture-01");
//		Lecture lctr1 = new Lecture(
//				"2115101014",
//				"I Ketut Resika Arthana, S.T., M.Kom",
//				"resika@undiksha.ac.id",
//				true,
//				"-",
//				"Technical Information",
//				"Technical & Vocational"
//		);		
//		lctr1.printAllInfo();
//		
//		
//		//staff
//		System.out.println("Staff-01");
//		Staff staff1 = new Staff(
//				"Idza Hanafi",
//				"idzahanafi03@gmail.com",
//				true,
//				"Jln. Gunung Semeru",
//				"Technical & Vocational"
//		);
//		staff1.printAllInfo();
//		
		
		
		//student
		System.out.println("Student");
		Student stdn = new Student(
				"2115101027",
				"Alucard",
				"Land Of Dawn",
				true,
				"Computer Science",
				"Technical Information",
				"Technical & Vocational"
		);
		stdn.printAllInfo();
		
		//Lecture
		System.out.println("Lecture");
		Lecture lctr1 = new Lecture(
				"999999999999999",
				"Zilong",
				"Jln Raya Sangsit",
				true,
				"zilong@undiksha.ac.id",
				"Technical Information",
				"Technical & Vocational"
		);	
		
		
		lctr1.printAllInfo();
		
		//Staff
		System.out.println("Staff");
		Staff stff1 = new Staff(
				"Xavier",
				"Jln. Gunung Semeru",
				true,
				"Xavier@gmail.com",
				"Technical & Vocational"
		);
		stff1.printAllInfo();
		
		
		
		
		
		
		
	}
}
