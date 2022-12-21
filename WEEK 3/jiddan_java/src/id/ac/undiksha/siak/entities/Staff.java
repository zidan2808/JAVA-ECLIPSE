package id.ac.undiksha.siak.entities;

public class Staff extends Person {
	
//	private String name;
//	private String address;
//	private boolean gender;
	private String email;
	private String faculty;
	
	public Staff(String name,  String address, boolean gender, String email,
			 String faculty) {
		super(name, address, gender);
//		this.name 			= name;
//		this.gender			= gender;
//		this.address		= address;
		this.email			= email;
		this.faculty 		= faculty;	
	}
	
	public Staff() {
//		this.name 			= "<Invalid Name>";
//		this.address		= "<Invalid Address>";
		this.email			= "<Invalid Study Program>";
		this.faculty 		= "<Invalid Faculty>";	
	}
	
	public void printAllInfo() {
		System.out.println("Name			: " + this.getName());
		System.out.println("Address			: " + this.getAddress());
		System.out.println("Gender			: " + (getGender()? "Male" : "Female"));
		System.out.println("Email			: " + this.email);
		System.out.println("Faculty			: " + this.faculty);
		System.out.println("");
	}
	
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
