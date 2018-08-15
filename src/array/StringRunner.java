package array;

public class StringRunner {

	public static void main(String[] args) {
		String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
				"Saturday"};


		String longestDay = "";
		for (String dayOfWeek:daysOfWeek) {
			if (dayOfWeek.length() > longestDay.length()) {
				longestDay = dayOfWeek;
			}

		}
		System.out.println("Day with most no of characters " + longestDay);

		for (int i = daysOfWeek.length - 1; i >= 0; i--) {

			System.out.println(daysOfWeek[i]);
		}


	}


}
