package mare;

public class Student implements Comparable<Student> {

	private int id;
	private String name;
	
	public Student (int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setID(int id) {
		this.id = id;
	}
	
	public String toString() {
		return String.format("Id of student is %d, name of student is %s\n", id, name);
	}

	public int compareTo(Student that) {

		 return Integer.compare(this.id, that.id);
//		 return Integer.compare(that.id, this.id); // reverse oreder
		
	}
}
