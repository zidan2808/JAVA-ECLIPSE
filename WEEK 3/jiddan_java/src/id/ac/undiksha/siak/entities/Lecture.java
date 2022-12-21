package id.ac.undiksha.siak.entities;

public class Lecture extends Person {
	
//	private String name;
//	private String address;
//	private boolean gender;
	private String nip;
	private String email;
	private String departement;
	private String faculty;
	
	public Lecture(String nip, String name, String address, boolean gender, String email, String departement,
			 String faculty) {
		super(name, address, gender);
//		this.name 			= name;
//		this.gender			= gender;
//		this.address		= address;
		this.nip 			= nip;
		this.email			= email;
		this.departement	= departement;
		this.faculty 		= faculty;	
	}
	
	public Lecture() {
//		this.name 			= "<Invalid Name>";
//		this.address		= "<Invalid Address>";
		this.nip 			= "<Invalid nip>";
		this.email			= "<Invalid Study Program>";
		this.departement	= "<Invalid Departement>";
		this.faculty 		= "<Invalid Faculty>";	
	}
	
	public void printAllInfo() {
		System.out.println("nip			: " + this.nip);
		System.out.println("Name			: " + this.getName());
		System.out.println("Address			: " + this.getAddress());
		System.out.println("Gender			: " + (getGender()? "Male" : "Female"));
		System.out.println("Email			: " + this.email);
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
	
	public String getNip() {
		return nip;
	}

	public void setNip(String nip) {
		this.nip = nip;
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
