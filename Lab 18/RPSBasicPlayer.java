//written by Timothy Gedney

public class RPSBasicPlayer implements RPSPlayer {

	//attributes
	private String gesture;
	private int points;
	
	//constructor
	public RPSBasicPlayer() {
		this.gesture = "rock";
		this.points = 0;
	}
	
	//mutators
	@Override
	public void setGesture(String gesture) {
		if (gesture.compareToIgnoreCase("rock") == 0 || gesture.compareToIgnoreCase("paper") == 0 ||gesture.compareToIgnoreCase("scissors") == 0) {
			this.gesture = gesture;
		} else {
			System.out.println("Gesture choice invalid, set to none.");
			this.gesture = "None";
		}
	}
	
	@Override
	public void setPoints(int points) {
		this.points = points;
	}
	
	//accessors
	@Override
	public String getGesture() {
		return this.gesture;
	}
	
	@Override
	public int getPoints() {
		return this.points;
	}
	
	//chooseGesture override
	@Override
	public void chooseGesture() {
		this.gesture = "rock";
	}
}
