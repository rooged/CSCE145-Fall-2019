//written by Timothy Gedney
import java.util.Scanner;
import java.util.Random;

@SuppressWarnings("unused")
public class rockPaperScissors {

	public static void main(String[] args) {

		//initialize variables and scanner input
		System.out.println("Greetings. Shall we play a game?"
				+ "\n\nLet's play Rock, Paper, Scissor's! Best 2 out of 3.");
		Scanner input = new Scanner(System.in);
		boolean game = true;
		int pcScore = 0;
		int userScore = 0;
		int round = 0;
		
		//loop to reset game until user exits, also resets variables every round
		while (game == true) {
			pcScore = 0;
			userScore = 0;
			round = 0;
			//loop for each round, initialize variables at beginning of each round
			while (round < 3) {
				int pcC = 0;
				String pc = "";
				int userC = 0;
				String user = "";
				
				//randomly assigns 1, 2, or, 3 to pcChoice variable, then assigns R/P/S based on variable
				int pcChoice = (int) (Math.random() * 10);
				while (pcChoice > 3 || pcChoice < 1) {
					pcChoice = (int) (Math.random() * 10);
				}
				if (pcChoice == 1) {
					pcC = 2;
					pc = "Rock";
				} else if (pcChoice == 2) {
					pcC = 3;
					pc = "Paper";
				} else {
					pcC = 1;
					pc = "Scissors";
				}
				
				//lets user input their choice
				System.out.print("\nEnter \"Rock\", \"Paper\", or \"Scissors\": ");
				String userChoice = input.next().toUpperCase();
				switch (userChoice) {
				case "ROCK":
				case "R":
					userC = 2;
					user = "Rock";
					break;
				case "PAPER":
				case "P":
					userC = 3;
					user = "Paper";
					break;
				case "SCISSORS":
				case "S":
					userC = 1;
					user = "Scissors";
					break;
				default:
					System.out.print("Not a valid input. ");
					break;
				}
				
				//checks that user entered valid String
				if (userC > 0) {
				System.out.print(user + " vs. " + pc + ". ");
				}
				
				//calcs score based on values of their choice variables
				if (userC == 0) {
					System.out.println("Computer wins.");
					pcScore++;
				} else if (pcC == userC) {
					System.out.println("It's a draw!");
				} else if (userC == 1 && pcC == 3) {
					System.out.println("Player wins.");
					userScore++;
				} else if (pcC == 1 && userC == 3) {
					System.out.println("Computer wins.");
					pcScore++;
				} else if (userC > pcC) {
					System.out.println("Player wins.");
					userScore++;
				} else if (pcC > userC) {
					System.out.println("Computer wins.");
					pcScore++;
				}
				
				//prints at end of each round to output the score
				System.out.println("Player has won " + userScore + " times and the computer has won " + pcScore + " times.");
				round++;
			}
			
			//outputs game end based on scores
			if (userScore == pcScore) {
				System.out.println("The game is a draw.");
			} else if (userScore > pcScore) {
				System.out.println("The player won the game!");
			} else {
				System.out.println("The computer won the game.");
			}
			
			//asks user if they want to play again, compares String input, checks their input is valid
			System.out.print("Do you want to play again? (Yes/No)");
			String playAgain = input.next().toUpperCase();
			while (playAgain.compareTo("YES") != 0 && playAgain.compareTo("Y") != 0 && playAgain.compareTo("NO") != 0 && playAgain.compareTo("N") != 0) {
				System.out.print("Unknown input, enter either 'Yes' or 'No': ");
				playAgain = input.next().toUpperCase();
			}
			if (playAgain.compareTo("NO") == 0 || playAgain.compareTo("N") == 0) {
				game = false;
			}
		}
		//game exit statement
		System.out.println();
		System.out.print("A strange game. The only winning move is not to play. Goodbye.");
		
		input.close();
	}

}
