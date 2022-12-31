package id.ac.undiksha.siak;
import id.ac.undiksha.siak.entities.Student;
import id.ac.undiksha.siak.entities.Lecturer;
import id.ac.undiksha.siak.entities.Staff;

public class Main {

	public static void main(String[] args) {
		Student studen1 = new Student(
				"Darmawan Jiddan", 
				"Singaraja", 
				true,
				"2115101013", 
				"ILKOM", 
				"TI", 
				"FTK"
				);
		studen1.printAll();
		
		Lecturer lecture1 = new Lecturer(
				"9999999999999", 
				"Land of Dawn", 
				"Singaraja", 
				false, 
				"TI",
				"FTK");
		lecture1.printAll();
		
		Staff staff1 = new Staff(
				"8888888888888", 
				"Zilong", 
				"Denpasar", 
				true, 
				"FTK");
		staff1.printAll();
	}
}
