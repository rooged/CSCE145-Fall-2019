//written by Timothy Gedney
import java.util.Random;
import java.util.Scanner;

@SuppressWarnings("unused")
public class diceRoll {

	public static void main(String[] args) {

		//query user for # of rolls
		System.out.print("Enter how many times you want to roll the 6 sided die: ");
		Scanner input = new Scanner(System.in);
		int rolls = input.nextInt();
		
		/** initialize variables, for loop to count the correct number of rolls,
		 	do while loop uses Math.random * 10 to randomly select variables
		 	within the range of 1-6**/
		int roll = 0, uno = 0, dos = 0, tres = 0, quatro = 0, cinqo = 0, seis = 0;
		for (int a = rolls;a > 0; a--) {
			do {
				roll = (int) (Math.random() * 10);
			} while (roll < 1 || roll > 6);
			System.out.println(roll + " was rolled");
			
			//uses 'roll' variable to add to each count of the number rolled
			switch (roll) {
			case 1:
				uno++;
				break;
			case 2:
				dos++;
				break;
			case 3:
				tres++;
				break;
			case 4:
				quatro++;
				break;
			case 5:
				cinqo++;
				break;
			case 6:
				seis++;
				break;
			}
		}
		
		//prints the roll count out and closes scanner
		System.out.println("One: " + uno);
		System.out.println("Two: " + dos);
		System.out.println("Three: " + tres);
		System.out.println("Four: " + quatro);
		System.out.println("Five: " + cinqo);
		System.out.println("Six: " + seis);
		
		input.close();
	}

}
