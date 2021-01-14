//written by Timothy Gedney

public class Box {

	//attributes 
	private String Label;
	private double Length;
	private double Width;
	private double Height;
	
	//default
	public Box() {
		this.Label = "Default";
		this.Length = 0.01;
		this.Width = 0.01;
		this.Height = 0.01;
	}
	
	//parameterized
	public Box(String Label, double Length, double Width, double Height) {
		this.setLabel(Label);
		this.setLength(Length);
		this.setWidth(Width);
		this.setHeight(Height);
	}
	
	//mutators
	public void setLabel(String Label) {
		this.Label = Label;
	}
	
	public void setLength(double Length) {
		if (Length < 0) {
			System.out.print("Length must be greater than 0, set to default value.");
			this.Length = 0.01;
		} else {
			this.Length = Length;
		}
	}
	
	public void setWidth(double Width) {
		if (Width <= 0) {
			System.out.print("Width must be greater than 0, set to default value.");
			this.Width = 0.01;
		} else {
			this.Width = Width;
		}
	}
	
	public void setHeight(double Height) {
		if (Height < 0) {
			System.out.print("Height must be greater than 0, set to default value.");
			this.Height = 0.01;
		} else {
			this.Height = Height;
		}
	}
	
	//accessors
	public String getLabel(String Label) {
		return this.Label;
	}
	
	public double getLength(double Length) {
		return this.Length;
	}
	
	public double getWidth(double Width) {
		return this.Width;
	}
	
	public double getHeight(double Height) {
		return this.Height;
	}
	
	//calcs volume
	public double getVolume() {
		double volume = Length * Width * Height;
		return volume;
	}

	//toString
	public String toString() {
		return "Label: " + Label + ", Volume: " + getVolume();
	}
	
}
