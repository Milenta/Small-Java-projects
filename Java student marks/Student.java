package mare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student {

	private String name;
	private ArrayList<Integer> marks = new ArrayList<Integer>();
	public Student( String name, int... marks ) {
		this.name = name;
		for (int mark : marks) {
			this.marks.add(mark);
		}
	}
	
	public int getNumberOfMarks() {
		int num_of_marks = marks.size();
		return num_of_marks;
	}
	
//	public void getAllMarks() {
//		System.out.println(Arrays.toString(marks));
//	}
	
	public int getSumOfMarks() {
		int sum = 0;
		for( int mark : marks) {
			sum = sum + mark;
		}
		return sum;
	}
	
	public int getMaxNum() {
		/*int max = Integer.MIN_VALUE;
		for (int mark : marks) {
			if (mark > max) {
				max = mark;
			}
		}
		return max;*/
		return Collections.max(marks);
	}
	
	public int getMinNum() {
		/*int min  = Integer.MAX_VALUE;
		for(int mark : marks) {
			if (mark < min) {
				min = mark;
			}
		}
		return min;*/
		return Collections.min(marks);
	}
	
	public BigDecimal getAvarageNum() {
		
		return new BigDecimal( getSumOfMarks() ).divide(new BigDecimal(getNumberOfMarks()), 3, RoundingMode.UP);
	}
	
	public void addNewMark(int new_mark) {
//		marks.length;
	}
	
}
