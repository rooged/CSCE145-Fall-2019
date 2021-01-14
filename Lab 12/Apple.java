//written by Timothy Gedney

public class Apple {

	//atributes
	private String type;
	private double weight;
	private double price;
	
	//default constructor
	public Apple() {
		this.type = "Gala";
		this.weight = 0.5;
		this.price = 0.89;
	}
	
	//parameterized constructor
	public Apple(String type, double weight, double price) {
		this.setType(type);
		this.setWeight(weight);
		this.setPrice(price);
	}
	
	//mutators
	public void setType(String type) {
		if (type.equalsIgnoreCase("Red Delicious") || type.equalsIgnoreCase("Golden Delicious") || type.equalsIgnoreCase("Gala") || type.equalsIgnoreCase("Granny Smith")) {
			this.type = type;
		} else {
			System.out.println("Type is invalid.");
			this.type = "Gala";
		}
	}
	
	public void setWeight(double weight) {
		if (weight >= 0 && weight <= 2) {
			this.weight = weight;
		} else {
			System.out.println("Weight is invalid.");
			this.weight = 0.5;
		}
	}
	
	public void setPrice(double price) {
		if (price >= 0) {
			this.price = price;
		} else {
			System.out.println("Price is invalid.");
			this.price = 0.89;
		}
	}
	
	//accessors
	public String getType() {
		return this.type;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public double getPrice() {
		return this.price;
	}

	//toString
	public String toString() {
		return "Name: " + type + "\nWeight: " + weight + "\nPrice: " + price;
	}
	
	//equals
	public boolean equals(Apple anapple) {
		return anapple != null && this.type.equalsIgnoreCase(anapple.getType()) && this.weight == anapple.getWeight() && this.price == anapple.getPrice();
	}
	
}
