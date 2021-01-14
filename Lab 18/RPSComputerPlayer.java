//written by Timothy Gedney
import java.util.Random;

public class RPSComputerPlayer extends RPSBasicPlayer {
	
	//attribute
	private Random rand;
	
	//constructor
	public RPSComputerPlayer() {
		super();
		rand = new Random();
	}
	
	//chooseGesture override for computer
	@Override
	public void chooseGesture() {
		int random = rand.nextInt((3 - 1) + 1) + 1;
		switch (random) {
		case 1:
			setGesture("rock");
			break;
		case 2:
			setGesture("paper");
			break;
		case 3:
			setGesture("scissors");
			break;
		}
	}

}
