//written by Timothy Gedney

public class Circle implements Shape {

	private double radius;
	
	public Circle() {
		this.radius = 1;
	}
	
	public Circle(double radius) {
		this.setRadius(radius);
	}
	
	public void setRadius(double radius) {
		if (radius > 0) {
			this.radius = radius;
		} else {
			System.out.println("Radius invalid.");
			this.radius = 0;
		}
	}
	
	public double getRadius() {
		return this.radius;
	}

	@Override
	public double getArea() {
		return (this.radius * this.radius) * Math.PI;
	}

	@Override
	public String getShapeType() {
		return "Circle";
	}
	
	@Override
	public String toString() {
		return this.getShapeType() + ", Radius: " + this.radius + ", Area: " + this.getArea();
	}
}
