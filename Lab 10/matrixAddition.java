//written by Timothy Gedney
import java.util.Scanner;

public class matrixAddition {

	public static void main(String[] args) {

		//introduce user and initialize scanner
		System.out.println("Welcome to the matrix addition calculator.");
		Scanner input = new Scanner(System.in);
		
		//initialize first matrix size
		System.out.println("\nEnter the length and width of the first matrix: ");	
		int firstL = input.nextInt();
		int firstW = input.nextInt();
		int[][] first = new int[firstL][firstW];
		
		//initialize second matrix size
		System.out.println("\nEnter the length and width of the second matrix: ");	
		int secondL = input.nextInt();
		int secondW = input.nextInt();
		int[][] second = new int[secondL][secondW];
		
		//check that they have equal dimensions
		if (firstL != secondL || firstW != secondW) {
			System.out.println("\nInvalid dimensions, can't add them together.");
			System.exit(0);
		}
		
		//user enters values for matrices
		for (int i = 0; i < firstL; i++) {
			for (int j = 0; j < firstW; j++) {
				System.out.print("\nMatrix 1, enter the value at index " + i + "," + j + ": ");
				first[i][j] = input.nextInt();
			}
		}
		for (int i = 0; i < secondL; i++) {
			for (int j = 0; j < secondW; j++) {
				System.out.print("\nMatrix 2, enter the value at index " + i + "," + j + ": ");
				second[i][j] = input.nextInt();
			}
		}
		
		//creates third matrix and adds matrices together to populate it
		int[][] result = new int[firstL][firstW];
		for (int i = 0; i < firstL; i++) {
			for (int j = 0; j < firstW; j++) {
				result[i][j] = first[i][j] + second[i][j];
			}
		}
		
		//print everything out to the console
		System.out.println();
		for (int i = 0; i < firstL; i++) {
			for (int j = 0; j < firstW; j++) {
				System.out.print(first[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("+");
		for (int i = 0; i < secondL; i++) {
			for (int j = 0; j < secondW; j++) {
				System.out.print(second[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("=");
		for (int i = 0; i < firstL; i++) {
			for (int j = 0; j < firstW; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	input.close();	
	}

}
