package mare;

public class Employee extends Person{

	private String title;
	private String employer;
	private int employeeGrade;
	private int salary;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getEmployer() {
		return employer;
	}
	public void setEmployer(String employer) {
		this.employer = employer;
	}
	
	public int getEmployeeGrade() {
		return employeeGrade;
	}
	public void setEmployeeGrade(int employeeGrade) {
		this.employeeGrade = employeeGrade;
	}
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
		
	public String toString() {
//		return String.format("Name is %s, phone is %s, email is %s. Title is %s, employer is %s,"
//				+ "employee grade is %d, salary is %d", getName(), getPhoneNumber(), getEmail(), getTitle(), employer, 
//				employeeGrade, salary);
		
		return String.format("N%s. Title is %s, employer is %s,"
				+ "employee grade is %d, salary is %d",super.toString(), getTitle(), employer, 
				employeeGrade, salary);
	}
	// super.nameOfMethod is calling method from parent class
	
}
