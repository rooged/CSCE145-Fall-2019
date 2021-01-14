//written by Timothy Gedney
import java.util.Scanner;

public class RPSHumanPlayer extends RPSBasicPlayer {

	//attribute
	private Scanner keyboard;
	
	//constructor
	public RPSHumanPlayer() {
		super();
		keyboard = new Scanner(System.in);
	}

	//chooseGesture override for user
	@Override
	public void chooseGesture() {
		String choice = keyboard.next();
		if (choice.compareToIgnoreCase("rock") == 0) {
			setGesture("rock");
		} else if (choice.compareToIgnoreCase("paper") == 0) {
			setGesture("paper");
		} else if (choice.compareToIgnoreCase("scissors") == 0) {
			setGesture("scissors");
		} else {
			setGesture("none");
		}
		
	}
}
