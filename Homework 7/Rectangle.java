//writen by Timothy Gedney

public class Rectangle implements Shape {

	private double length;
	private double width;
	
	public Rectangle() {
		this.length = 1;
		this.width = 1;
	}
	
	public Rectangle(double length, double width) {
		this.setLength(length);
		this.setWidth(width);
	}
	
	public void setLength(double length) {
		if (length > 0) {
			this.length = length;
		} else {
			System.out.println("Length invalid.");
			this.length = 0;
		}
	}
	
	public void setWidth(double width) {
		if (width > 0) {
			this.width = width;
		} else {
			System.out.println("Width invalid.");
			this.width = 0;
		}
	}
	
	public double getLength() {
		return this.length;
	}
	
	public double getWidth() {
		return this.width;
	}
	
	@Override
	public double getArea() {
		return this.length * this.width;
	}

	@Override
	public String getShapeType() {
		return "Rectangle";
	}
	
	@Override
	public String toString() {
		return this.getShapeType() + ", Length: " + this.length + ", Width: " + this.width + ", Area: " + this.getArea();
	}
}
