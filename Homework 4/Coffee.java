//written by Timothy Gedney

public class Coffee {

	//attributes
	private String Name;
	private double Caffeine;
	
	//mutators
	public void setName(String Name) {
		this.Name = Name;
	}
	
	public void setCaffeine(double Caffeine) {
		if (Caffeine >= 50 && Caffeine <= 300) {
			this.Caffeine = Caffeine;
		} else if (Caffeine < 50){
			System.out.println("That caffeine content is too small, value set to 50.");
			this.Caffeine = 50;
		} else {
			System.out.println("That caffeine content is too large, value set to 300.");
			this.Caffeine = 300;
		}
	}
	
	//accessors
	public String getName() {
		return this.Name;
	}
	
	public double getCaffeine() {
		return this.Caffeine;
	}
	
	//checks if risky
	public double RiskyAmount() {
		double cups = 180.0 / ((Caffeine / 100.0) * 6.0);
		return cups;
	}
}
