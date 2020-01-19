package mare;

public class Customer {

	// state 
	private String name;
	private Address homeAddress;
	private Address workAddress;
	
	// creation
	
	public Customer(String name, Address homeAddress) {
		this.name = name;
		this.homeAddress = homeAddress;
	}
	
	// operations
	
	public Address getWorkAddress() {
		return workAddress;
	}
	
	public void setWorkAddress(Address workAddress) {
		this.workAddress = workAddress;
	}
	
	public Address getHomeAddress() {
		return homeAddress;
	}
	
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
	
	public String toString() {
		return String.format("Name is %s, %s and work %s.", name, homeAddress, workAddress);
	}
	
	
}
