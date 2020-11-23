package week2;

public class Person {
	
	String firstname;
	String lastname;
	int phonenumber;
	String streetaddress;
	
	
	public String getFirstname() {
		return firstname;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public int getPhone() {
		return phonenumber;
	}
	
	public String getStreet() {
		return streetaddress;
	}
	
	public Person(String firstname, String lastname, int phonenumber, String streetaddress) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.phonenumber = phonenumber;
		this.streetaddress = streetaddress;
	}
}
