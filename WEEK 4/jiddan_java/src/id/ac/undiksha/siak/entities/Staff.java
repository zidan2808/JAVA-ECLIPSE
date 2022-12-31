package id.ac.undiksha.siak.entities;

public class Staff extends Person{
	private String nip;
	private String faculty;
	
	
//	public Staff() {
//		this.nip 			= "<invalid nip>";
//		this.name 			= "<invalid name>";
//		this.address 		= "<invalid address>";
//		this.faculty		= "<invalid faculty>";
//	}
//	
//	public Staff(String nip, String name, String address, boolean gender, String faculty) {
//		super();
//		this.nip = nip;
//		this.name = name;
//		this.address = address;
//		this.gender = gender;
//		this.faculty = faculty;
//	}
	
	public Staff() {
		super();
		// TODO Auto-generated constructor stub
		this.nip 			= "<invalid nip>";
		this.faculty		= "<invalid faculty>";
	}

	public Staff(String nip, String name, String address, boolean gender, String faculty) {
		super(name, address, gender);
		// TODO Auto-generated constructor stub
		this.nip = nip;
		this.faculty = faculty;
	}

	public void printAll() {
		System.out.println("\n");
		System.out.println("NIP: "			+ this.getNip());
		System.out.println("Name: "			+ this.getName());
		System.out.println("Address: "		+ this.getAddress());
		System.out.println("Gender: "		+ (getGender() ? "Male":"Female"));
		System.out.println("Faculty: "	+ this.getFaculty());
	}
	
	public String getNip() {
		return nip;
	}
	public void setNip(String nip) {
		this.nip = nip;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setDepartment(String faculty) {
		this.faculty = faculty;
	}
	
	
}
