package mare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class DescendingStudentComparator implements Comparator <Student>{
	@Override
	public int compare(Student student1, Student student2) {
		return Integer.compare(student2.getId(), student1.getId());
	}
}

public class StudentRunner {

	public static void main(String [] args) {
		
		List<Student> students = List.of(new Student(1, "Marko"),
				new Student(5, "Nikola"),
				new Student(3, "Milica"));
//		System.out.println(students);
		
		List<Student> studemtsAl = new ArrayList<>(students);
		Collections.sort(studemtsAl);
		System.out.println("Ascending by ID : " + studemtsAl);
		
//		Collections.sort(studemtsAl, new DescendingStudentComparator()); // option 1
		studemtsAl.sort(new DescendingStudentComparator()); // option 2 array list, sort, sorter implementation 
		System.out.println("Descending by ID : " + studemtsAl);
	}
	
}
