package id.ac.undiksha.siak.entities;

public class Staff {
	
	private String name;
	private String address;
	private boolean gender;
	private String email;
	private String faculty;
	
	public Staff(String name, String address, boolean gender, String email,
			 String faculty) {
		super();
		this.name 			= name;
		this.email			= email;
		this.gender			= gender;
		this.address		= address;
		this.faculty 		= faculty;	
	}
	
	public Staff() {
		this.name 			= "<Invalid Name>";
		this.address		= "<Invalid Address>";
		this.email			= "<Invalid Study Program>";
		this.faculty 		= "<Invalid Faculty>";	
	}
	
	public void printAllInfo() {
		System.out.println("Name			: " + this.name);
		System.out.println("Email			: " + this.address);
		System.out.println("Gender			: " + (gender? "Male" : "Female"));
		System.out.println("Address			: " + this.email);
		System.out.println("Faculty			: " + this.faculty);
		System.out.println("");
	}
	
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}


	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
