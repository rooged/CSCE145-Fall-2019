//written by Timothy Gedney

public class Vehicle {

	//attributes
	private String mName;
	private int cylinders;
	private String oName;
	
	//default
	public Vehicle() {
		this.mName = "None";
		this.cylinders = 1;
		this.oName = "None";
	}
	
	//parameterized
	public Vehicle(String mName, int cylinders, String oName) {
		this.setmName(mName);
		this.setcylinders(cylinders);
		this.setoName(oName);
	}
	
	//mutators
	public void setmName(String mName) {
		this.mName = mName;
	}
	
	public void setcylinders(int cylinders) {
		if (cylinders <= 0) {
			System.out.println("The number of cylinders is invalid.");
			this.cylinders = 1;
		} else {
			this.cylinders = cylinders;
		}
	}
	
	public void setoName(String oName) {
		this.oName = oName;
	}
	
	//accessors
	public String getmName() {
		return this.mName;
	}
	
	public int getcylinders() {
		return this.cylinders;
	}
	
	public String getoName() {
		return this.oName;
	}
	
	//equals method
	public boolean equals(Vehicle aV) {
		return aV != null && this.mName.equalsIgnoreCase(aV.getmName()) && this.cylinders == aV.getcylinders() && this.oName.equalsIgnoreCase(aV.getoName());
	}

	//toString
	public String toString() {
		return "Manufacturer's Name: " + this.mName + "\nCylinders: " + this.cylinders + "\nOwner Name: " + this.oName;
	}
}
