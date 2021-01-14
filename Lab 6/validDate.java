//written by Timothy Gedney
import java.util.Scanner;

public class validDate {

	public static void main(String[] args) {
		
		//query user for date input
		System.out.print("Enter a date in the format month/day/year: ");
		Scanner input = new Scanner(System.in);
		String date = input.next();
		
		//create index of the / so that a substring can created from such
		int first = date.indexOf('/');
		if (first == -1) {
			System.out.print("The date you entered is in an invalid format.");
			System.exit(0);
		}
		int second = date.indexOf('/', date.indexOf('/') + 1);
		if (second == -1) {
			System.out.print("The date you entered is in an invalid format.");
			System.exit(0);
		}
		
		//split string into integer sections based on '/'
		int month = Integer.parseInt(date.substring(0,first));
		int day = Integer.parseInt(date.substring(first + 1,second));
		int year = Integer.parseInt(date.substring(second + 1));
		
		//ensure month is valid
		if (month < 1 || month > 12) {
			System.out.print(date + " is invalid. The month you entered is incorrect, must be between 1 & 12.");
			System.exit(0);
		}
		
		//ensure day is 1 or greater
		if (day < 1) {
			System.out.print(date + " is invalid. The day you entered is incorrect, must be 1 or greater.");
			System.exit(0);
		}
		
		//checks months w/ 31 days
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			if (day > 31) {
				System.out.print(date + " is invalid. The day you entered is incorrect,\nmust be below 31 for this month.");
				System.exit(0);
			}
		//checks february by first checking if it's a leap year and then checking if it the day is less than 28/29 days
		} else if (month == 2) {
			boolean leapYear = false;
			if (year % 4 == 0) {
				if (year % 100 == 0) {
					if (year % 400 == 0) {
						leapYear = true;
						if (day > 29) {
							System.out.print(date + " is invalid. The day you entered is incorrect,\nmust be 29 or lower for this month on a leap year.");
							System.exit(0);
						}
					}
				}
			}
			if (leapYear == false) {
				if (day > 28) {
					System.out.print(date + " is invalid. The day you entered is incorrect,\nmust be 28 or lower for this month since it's not a leap year.");
					System.exit(0);
				}
			}
		// checks months w/ 30 days
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			if (day > 30) {
				System.out.print(date + " is invalid. The day you entered is incorrect,\nmust be below 30 for this month.");
				System.exit(0);
			}
		}
		
		//if all if statements weren't initiated then the date is valid & this prints
		System.out.print(date + " is a valid date.");
		
		input.close();
	}
}
