//written by Timothy Gedney
import java.util.Scanner;

public class Grader {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Grader Program");
		Scanner input = new Scanner(System.in);
		boolean repeat = true;
		
		while (repeat) {
			System.out.print("\nEnter a file name or \"quit\" to exit: ");
			String fileName = input.nextLine();
			if (fileName.equalsIgnoreCase("quit")) {
				System.out.println("Goodbye");
				System.exit(0);
			}
			Student s = new Student();
			s.readGradeFile(fileName);
			System.out.print(s.toString());
			System.out.println();
		}
		input.close();
	}
}
