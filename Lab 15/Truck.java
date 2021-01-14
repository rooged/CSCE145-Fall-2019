//written by Timothy Gedney

public class Truck extends Vehicle {

	//attributes
	private double load;
	private double tow;
	
	//default
	public Truck() {
		super();
		this.load = 0;
		this.tow = 0;
	}
	
	//parameterized
	public Truck(String mName, int cylinders, String oName, double load, double tow) {
		super(mName, cylinders, oName);
		this.setload(load);
		this.settow(tow);
	}
	
	//mutators
	public void setload(double load) {
		if (load < 0) {
			System.out.println("The load capacity is invalid.");
			this.load = 0;
		} else {
			this.load = load;
		}
	}
	
	public void settow(double tow) {
		if (tow < 0) {
			System.out.println("The tow capacity is invalid.");
			this.tow = 0;
		} else {
			this.tow = tow;
		}
	}
	
	//accessors
	public double getload() {
		return this.load;
	}
	
	public double gettow() {
		return this.tow;
	}
	
	//equals method
	public boolean equals(Truck aT) {
		return aT != null && super.equals(aT) && this.load == aT.getload() && this.tow == aT.gettow();
	}

	//toString
	public String toString() {
		return super.toString() + "\nLoad Capacity: " + this.load + "\nTowing Capacity: " + this.tow;
	}
}
