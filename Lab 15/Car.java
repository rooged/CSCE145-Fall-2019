//written by Timothy Gedney

public class Car extends Vehicle {

	//attributes
	private double gas;
	private int seats;
	
	//default
	public Car() {
		super();
		this.gas = 0;
		this.seats = 0;
	}
	
	//parameterized
	public Car(String mName, int cylinders, String oName, double gas, int seats) {
		super(mName, cylinders, oName);
		this.setgas(gas);
		this.setseats(seats);
	}
	
	//mutators
	public void setgas(double gas) {
		if (gas < 0) {
			System.out.println("The gas mileage is invalid.");
			this.gas = 0;
		} else {
			this.gas = gas;
		}
	}
	
	public void setseats(int seats) {
		if (seats < 0) {
			System.out.println("The number of seats is invalid.");
			this.seats = 0;
		} else {
			this.seats = seats;
		}
	}
	
	//accessors
	public double getgas() {
		return this.gas;
	}
	
	public int getseats() {
		return this.seats;
	}
	
	//equals method
	public boolean equals(Car aC) {
		return aC != null && super.equals(aC) && this.gas == aC.getgas() && this.seats == aC.getseats();
	}

	//toString
	public String toString() {
		return super.toString() + "\nGas Mileage: " + this.gas + "\nNumber of Passengers: " + this.seats;
	}
}
