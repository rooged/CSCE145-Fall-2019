//written by Timothy Gedney
import java.util.Scanner;

public class triangleMaker {

	public static void main(String[] args) {

		//ask user for input
		System.out.print("Enter how large you want the triangle to be (must be positive): ");
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		
		//check that the input is 0 or greater
		while (size < 0) {
			System.out.print("You've entered a negative number, it must be positive. Enter again: ");
			size = input.nextInt();
		}
		
		//print out top half up to the full width
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//print out bottom half
		for (int i = size - 1; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		input.close();
	}

}
