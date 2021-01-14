//written by Timothy Gedney

public class Triangle implements Shape {

	private double base;
	private double height;
	
	public Triangle() {
		this.base = 1;
		this.height = 1;
	}
	
	public Triangle(double base, double height) {
		this.setBase(base);
		this.setHeight(height);
	}
	
	public void setBase(double base) {
		if (base > 0) {
			this.base = base;
		} else {
			System.out.println("Base invalid.");
			this.base = 0;
		}
	}
	
	public void setHeight(double height) {
		if (height > 0) {
			this.height = height;
		} else {
			System.out.println("Height invalid.");
			this.height = 0;
		}
	}
	
	public double getBase() {
		return this.base;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	@Override
	public double getArea() {
		return (this.base * this.height) / 2;
	}

	@Override
	public String getShapeType() {
		return "Triangle";
	}
	
	@Override
	public String toString() {
		return this.getShapeType() + ", Base: " + this.base + ", Height: " + this.height + ", Area: " + this.getArea();
	}
}
