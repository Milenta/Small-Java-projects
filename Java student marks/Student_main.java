package mare;

import java.util.Arrays;

public class Student_main {

	public static void main(String[] args) {
		
		Student student = new Student("Mare", new int[] {99, 98, 100, 114});
		
		System.out.println(student.getNumberOfMarks());
		System.out.println(student.getSumOfMarks());
		System.out.println(student.getMaxNum());
		System.out.println(student.getMinNum());
		System.out.println(student.getAvarageNum());
		student.addNewMark(55);
//		student.getAllMarks();
	}

}
