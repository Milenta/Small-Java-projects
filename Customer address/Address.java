package mare;

public class Address {

	// state
	private String line1;
	private String city;
	private String zip;
	
	// creation 
	public Address(String line1, String city, String zip) {
		this.city = city;
		this.line1 = line1;
		this.zip = zip;
	}
	
	public String toString() {
		return String.format("address is %s, city is %s, zip code is %s", line1, city, zip);
	}
}
