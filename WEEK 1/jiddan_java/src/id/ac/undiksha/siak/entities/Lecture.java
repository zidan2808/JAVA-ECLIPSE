package id.ac.undiksha.siak.entities;

public class Lecture {
	
	private String nip;
	private String name;
	private String address;
	private boolean gender;
	private String email;
	private String departement;
	private String faculty;
	
	public Lecture(String nip, String name, String address, boolean gender, String email, String departement,
			 String faculty) {
		super();
		this.nip 			= nip;
		this.name 			= name;
		this.email			= email;
		this.gender			= gender;
		this.address		= address;
		this.departement	= departement;
		this.faculty 		= faculty;	
	}
	
	public Lecture() {
		this.nip 			= "<Invalid nip>";
		this.name 			= "<Invalid Name>";
		this.address		= "<Invalid Address>";
		this.email			= "<Invalid Study Program>";
		this.departement	= "<Invalid Departement>";
		this.faculty 		= "<Invalid Faculty>";	
	}
	
	public void printAllInfo() {
		System.out.println("nip			: " + this.nip);
		System.out.println("Name			: " + this.name);
		System.out.println("Email			: " + this.address);
		System.out.println("Gender			: " + (gender? "Male" : "Female"));
		System.out.println("Address			: " + this.email);
		System.out.println("Departement		: " + this.departement);
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

	public String getNip() {
		return nip;
	}

	public void setNip(String nip) {
		this.nip = nip;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public String getDepartement() {
		return departement;
	}

	public void setDepartement(String departement) {
		this.departement = departement;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
