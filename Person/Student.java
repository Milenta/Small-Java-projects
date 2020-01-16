package mare;

public class Student extends Person {
	
	private String college;
	private int year;
	
	public Student() {

	}
	
	public String getColageName() {
		return college;
	}
	public void setColageName(String colageName) {
		this.college = colageName;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public String toString() {
		return String.format("Name of student is %s. Email: %s. Phone number: %s. Studyes at %s.", 
				getName(), getEmail() , getPhoneNumber(), college);
	}
	
}
