//written by Timothy Gedney
import java.util.Scanner;

public class aBelowAverageWinter {

	public static void main(String[] args) {
		
		//ask user for input
		System.out.println("Welcome to the below average temperature tester program.\n");
		Scanner input = new Scanner(System.in);
		
		//initialize array and counter to sum up all days
		double[] temp = new double[10];
		double count = 0;
		
		//user inputs 10 values and the average is calculated
		for (int i = 0; i < 10; i++) {
			System.out.print("Enter the temperature for day " + (i + 1) + ": ");
			temp[i] = input.nextDouble();
			count += temp[i];
		}
		double average = count / 10;
		
		//outputs average and uses loop to go through array to output days below that average
		System.out.println("\nThe average temperature was " + average);
		System.out.println("The days below that average were:");
		for (int i = 0; i < 10; i++) {
			if (temp[i] < average) {
				System.out.println("Day " + (i + 1) + " with " + temp[i]);
			}
		}
		
		input.close();
	}
}
