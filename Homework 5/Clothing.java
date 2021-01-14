//written by Timothy Gedney

public class Clothing {

	private String Type;
	private String Color;
	
	public Clothing() {
		this.Type = "Top";
		this.Color = "Red";
	}
	
	public Clothing(String Type, String Color) {
		this.setType(Type);
		this.setColor(Color);
	}
	
	public void setType(String Type) {
		if (Type.equalsIgnoreCase("Undergarment") || Type.equalsIgnoreCase("Socks") || Type.equalsIgnoreCase("Stockings") || Type.equalsIgnoreCase("Top") || Type.equalsIgnoreCase("Bottom") || Type.equalsIgnoreCase("Cape")) {
			this.Type = Type;
		} else {
			System.out.println("You entered an invalid type, setting type to top.");
			this.Type = "Top";
		}
	}
	
	public void setColor(String Color) {
		if (Color.equalsIgnoreCase("Brown") || Color.equalsIgnoreCase("Red") || Color.equalsIgnoreCase("Pink") || Color.equalsIgnoreCase("Orange") || Color.equalsIgnoreCase("Green") || Color.equalsIgnoreCase("Blue") || Color.equalsIgnoreCase("Purple") || Color.equalsIgnoreCase("Grey")) {
			this.Color = Color;
		} else {
			System.out.println("You entered an invalid color, setting type to red.");
			this.Color = "Red";
		}
	}
	
	public String getType() {
		return this.Type;
	}
	
	public String getColor() {
		return this.Color;
	}

	public String toString() {
		return this.Type + " " + this.Color;
	}
	
	public boolean equals(Clothing cloth) {
		return cloth != null && this.Type.equalsIgnoreCase(cloth.getType()) && this.Color.equalsIgnoreCase(cloth.getColor());
	}
	
	
}
