// written by Timothy Gedney
import java.util.Scanner;

public class ChineseZodiac {

	public static void main(String[] args) {

		//asks user for their birth year
		System.out.println("Enter your birth year to calculate your Chinease zodiac sign!");
		
		Scanner input = new Scanner(System.in);
		int birth = input.nextInt();
		
		//checks that their birth year isn't before 1924, if so it exits the program, if not it continues on
		if (birth < 1924) {
			int age = 2019 - birth;
			System.out.println("Congrats on making it to " + age + " years old, but sadly I'm unable to\ncalculate a Zodiac for someone that old, sorry!");
			System.exit(0);
		}
		
		//computes the zodiac year, creates zodiac variable, & element variable
		int year = (birth - 1924) % 12;
		String zodiac = "";
		int element = 0;
		
		//switch statement to choose based on the remainder of the previous computation, also assigns element value
		switch (year) {
			case 0:
				zodiac = "Rat";
				element = 1;
				break;
			case 1:
				zodiac = "Ox";
				element = 2;
				break;
			case 2:
				zodiac = "Tiger";
				element = 3;
				break;
			case 3:
				zodiac = "Rabbit";
				element = 3;
				break;
			case 4:
				zodiac = "Dragon";
				element = 2;
				break;
			case 5:
				zodiac = "Snake";
				element = 4;
				break;
			case 6:
				zodiac = "Horse";
				element = 4;
				break;
			case 7:
				zodiac = "Goat";
				element = 2;
				break;
			case 8:
				zodiac = "Monkey";
				element = 5;
				break;
			case 9:
				zodiac = "Rooster";
				element = 5;
				break;
			case 10:
				zodiac = "Dog";
				element = 2;
				break;
			case 11:
				zodiac = "Pig";
				element = 1;
				break;
		}
		String type = "";
		
		//switch statement to actually assign the element type
		switch (element) {
			case 1:
				type = "Water ";
				break;
			case 2:
				type = "Earth ";
				break;
			case 3:
				type = "Wood ";
				break;
			case 4:
				type = "Fire ";
				break;
			case 5:
				type = "Metal ";
				break;
		}
		
		//outputs final element type & zodiac sign (if/else statement for the 'a'/'an')
		if (element == 2) {
			System.out.println("You are an " + type + zodiac + ".");
		} else
			System.out.println("You are a " + type + zodiac + ".");
	
	input.close();
	}

}
