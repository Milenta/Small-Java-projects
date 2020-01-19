package mare;

public class Person {

	// state 
	
	private String name;
	private String email;
	private String phone;
	
	// creation 
	
//	public Person(String name, String email, String phoneNumber) {
//		this.name = name;
//		this.email = email;
//		this.phoneNumber = phoneNumber;
//	}
	
	// operations
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phone;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phone = phoneNumber;
	}
	
	public String toString() {
		return String.format("Name is %s, email is %s. phone number is %s", name, email, phone);
	}
}
