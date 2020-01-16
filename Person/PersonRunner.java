package mare;

public class PersonRunner {

	public static void main(String[] args) {
		
		Person person = new Person();
		
		person.setName("Mare");
		person.setEmail("mare@gmail.com");
//		Person person = new Person("Mare", "mare@gmail.com", "06566");
//		System.out.println(person);
		
		Employee mare = new Employee();
		mare.setName("Marko");
		mare.setEmail("mare@gmai.com");
		mare.setPhoneNumber("06566");
		mare.setEmployeeGrade(8);
		mare.setEmployer("AlliedTesting");
		mare.setSalary(100000);
		System.out.println(mare);

	}

}
