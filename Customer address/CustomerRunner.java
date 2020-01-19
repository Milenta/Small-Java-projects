package mare;

public class CustomerRunner {

	public static void main(String[] args) {
		
		Address homeAddress = new Address("Milosa S", "Beograd", "11000");
		Customer customer = new Customer("Marko", homeAddress);
		
		Address workAddress = new Address("Juria G", "Beograd", "11070");
		customer.setWorkAddress(workAddress);
		
		System.out.println(customer);
		
	}
	
}
