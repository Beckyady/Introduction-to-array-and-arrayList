package array;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		// int marks[] = { 97, 99, 100 };
		Student student = new Student("Ranga", 98, 99, 100);

		int numbers = student.getNumbersOfMarks();
		int sum = student.getTotalSumOfMarks();
		int maximumMarks = student.getmaximumMarks();
		System.out.println("Maximum mark:" + maximumMarks);
		int minimumMarks = student.getminimumMarks();
		System.out.println("Minimum mark:" + minimumMarks);
		BigDecimal average = student.getAverageMarks();
		System.out.println("Average mark: " + average);

		student.addNewMark(35);
		// student.removeMarkAtIndex(5);

	}

}
