package id.ac.undiksha.siak.entities;

public class Lecturer extends Person{
	
	private String nip;
	private String department;
	private String faculty;
	
//	public Lecturer(String nip, String name, String address, boolean gender, String department,
//			String faculty) {
//		super();
//		this.nip = nip;
//		this.name = name;
//		this.address = address;
//		this.gender = gender;
//		this.department = department;
//		this.faculty = faculty;
//	}
	
//	public Lecturer() {
//		this.nip 			= "<invalid nip>";
//		this.name 			= "<invalid name>";
//		this.address 		= "<invalid address>";
//		this.department 	= "<invalid department>";
//		this.faculty 		= "<invalid faculty>";
//	}

	public Lecturer() {
		super();
		this.nip 			= "<invalid nip>";
		this.department 	= "<invalid department>";
		this.faculty 		= "<invalid faculty>";
		
	}

	public Lecturer(String nip, String name, String address, boolean gender, String department,
			String faculty) {
		super(name, address, gender);
		// TODO Auto-generated constructor stub
		this.nip = nip;
		this.department = department;
		this.faculty = faculty;
	}

	public void printAll() {
		System.out.println("\n");
		System.out.println("NIM: "			+ this.getNip());
		System.out.println("Name: "			+ this.getName());
		System.out.println("Address: "		+ this.getAddress());
		System.out.println("Gender: "		+ (getGender() ? "Male":"Female"));
		System.out.println("Department: "	+ this.getDepartment());
		System.out.println("Faculty: "		+ this.getFaculty());
	}

	public String getNip() {
		return nip;
	}



	public void setNip(String nip) {
		this.nip = nip;
	}



	public String getDepartment() {
		return department;
	}



	public void setDepartment(String department) {
		this.department = department;
	}



	public String getFaculty() {
		return faculty;
	}



	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	
	
}
