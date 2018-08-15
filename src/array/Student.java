package array;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Student {

	private String name;
	private ArrayList<Integer> marks = new ArrayList<Integer>();

	public Student(String name, Integer... marks) {
		this.name = name;

		for (int mark : marks) {
			this.marks.add(mark);
		}

	}

	public int getNumbersOfMarks() {
		int length = marks.size();
		System.out.println("Number of marks: " + length);
		return marks.size();
	}

	public int getTotalSumOfMarks() {
		int sum = 0;
		for (int mark : marks) {
			sum = sum + mark;
		}
		System.out.println("Total sum of marks: " + sum);
		return sum;
	}

	public int getmaximumMarks() {
		int maximum = Integer.MIN_VALUE;
		for (int mark : marks) {
			if (mark > maximum) {
				maximum = mark;
			}

		}

		return maximum;
	}

	public int getminimumMarks() {
		int minimum = Integer.MAX_VALUE;
		for (int mark : marks) {
			if (mark < minimum) {
				minimum = mark;
			}

		}

		return minimum;


	}

	public BigDecimal getAverageMarks() {
		int sum = getTotalSumOfMarks();
		int lenght = getNumbersOfMarks();
		return new BigDecimal(sum).divide(new BigDecimal(lenght), 3, RoundingMode.UP);

}

	public void addNewMark(int... marks) {
		// ArrayList <int> student = new ArrayList <int>()


	}
}
