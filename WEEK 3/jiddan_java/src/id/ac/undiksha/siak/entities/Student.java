package id.ac.undiksha.siak.entities;

public class Student extends Person {
	
	private String nim;
	private String studyProgram;
	private String departement;
	private String faculty;	
	
	
	public Student(String nim, String name, String address, boolean gender, String studyProgram, String departement,
			 String faculty) {
		super(name, address, gender);
		this.nim 			= nim;
		this.studyProgram	= studyProgram;
		this.departement	= departement;
		this.faculty 		= faculty;	
	}


	public Student() {
		this.nim 			= "<Invalid NIM>";
		this.studyProgram	= "<Invalid Study Program>";
		this.departement	= "<Invalid Departement>";
		this.faculty 		= "<Invalid Faculty>";	
	}
	
	public void printAllInfo() {
		System.out.println("NIM			: " + this.nim);
		System.out.println("Name			: " + this.getName());
		System.out.println("Address			: " + this.getAddress());
		System.out.println("Gender			: " + (getGender()? "Male" : "Female"));
		System.out.println("Study Program		: " + this.studyProgram);
		System.out.println("Departement		: " + this.departement);
		System.out.println("Faculty			: " + this.faculty);
		System.out.println("");
	}
	
	public  void sosmed() {
		System.out.println("@zdan.bit");
	}
	
	public String getFaculty() {
		return faculty;
	}
	
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}


	public String getNim() {
		return nim;
	}

	public void setNim(String nim) {
		this.nim = nim;
	}

	public String getDepartement() {
		return departement;
	}

	public void setDepartement(String departement) {
		this.departement = departement;
	}

	public String getStudyProgram() {
		return studyProgram;
	}

	public void setStudyProgram(String studyProgram) {
		this.studyProgram = studyProgram;
	}
	
	
	
	
}
