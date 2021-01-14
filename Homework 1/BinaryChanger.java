// written by Timothy Gedney
import java.util.Scanner;

public class BinaryChanger {

	public static void main(String[] args) {

		// Initialize scanner, query user for binary inputs, inputs are strings
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a 4-bit binary number: ");
		String first = input.next();
		int one = 0;
		System.out.print("Enter another 4-bit binary number: ");
		String second = input.next();
		int two = 0;
		
		// compares each character in the string to 1 & adds up the decimal equivalent of the binary #
		int add = (int) Math.pow(2,(first.length() - 1));
		for (int a = 0; a <= first.length() - 1; a++) {
			if (first.charAt(a) == '1') {
				one += add;
			}
			add /= 2;
		}
		
		// same thing for input two
		int add2 = (int) Math.pow(2,(second.length() - 1));
		for (int a = 0; a <= second.length() - 1; a++) {
			if (second.charAt(a) == '1') {
				two += add2;
			}
			add2 /= 2;
		}
		
		/** adds the two numbers together in decimal form, checks
		 * to ensure they're below 15 and asks for new numbers if
		 * they are. (I did this so the program won't crash if
		 * someone accidently inputs too many 1's since it's written
		 * to ignore 0's)
		**/
		int fin = one + two;
		while (fin > 15) {
			System.out.println("I can't calculate that high please enter new numbers. ");
			System.out.print("Enter a 4-bit binary number: ");
			first = input.next();
			one = 0;
			System.out.print("Enter another 4-bit binary number: ");
			second = input.next();
			two = 0;
			
			add = (int) Math.pow(2,(first.length() - 1));
			for (int a = 0; a <= first.length() - 1; a++) {
				if (first.charAt(a) == '1') {
					one += add;
				}
				add /= 2;
			}
			
			add2 = (int) Math.pow(2,(second.length() - 1));
			for (int a = 0; a <= second.length() - 1; a++) {
				if (second.charAt(a) == '1') {
					two += add2;
				}
				add2 /= 2;
			}
			fin = one + two;
		}
		
		//outputs inputs & sum in decimal form
		System.out.println("The first number is " + one);
		System.out.println("The second number is " + two);
		System.out.print("The two added together is " + fin);
		
		/**this converts the decimal sum back into binary by using the if statements
		 * to compare the remainder of each division to 1 & changing the binary bit
		 * variable to "1" if it's true **/
		String uno = "0", dos = "0", tres = "0", quattro = "0";
		if (fin % 2 == 1) {
			quattro = "1";
		}
		fin /= 2;
		if (fin % 2 == 1) {
			tres = "1";
		}
		fin /= 2;
		if (fin % 2 == 1) {
			dos = "1";
		}
		fin /= 2;
		if (fin % 2 == 1) {
			uno = "1";
		}
		System.out.print(" or " + uno + dos + tres + quattro + " in binary");
		
		input.close();
	}
}
