//written by Timothy Gedney

public class ShapeCollection {

	Shape[] shapes;
	
	public ShapeCollection() {
		this.shapes = new Shape[50];
	}
	
	public void addShape(Shape shape) {
		if (shape.getArea() == 0) {
			return;
		}
		for (int i = 0; i < this.shapes.length; i++) {
			if (this.shapes[i] == null) {
				this.shapes[i] = shape;
				return;
			}
		}
		System.out.println("Your shape collection is full.");
	}
	
	public void sortShapes() {
		for (int i = 0; i < this.shapes.length; i++) {
			for (int j = i + 1; j < this.shapes.length; j++) {
				if (shapes[j] != null) {
					if (shapes[i].getArea() > shapes[j].getArea()) {
						Shape shape = shapes[i];
						shapes[i] = shapes[j];
						shapes[j] = shape;
					}
				}
			}
		}
	}
	
	public void removeShape(String shape, double area) {
		int count = 0;
		for (int i = 0; i < shapes.length; i++) {
			if (shapes[i] != null) {
				if (shapes[i].getShapeType().compareToIgnoreCase(shape) == 0 && shapes[i].getArea() == area) {
					shapes[i] = null;
					count--;
				}
			}
			count++;
		}
		if (count == shapes.length) {
			System.out.println("Shape not found.");
		}
	}
	
	public void printShapes() {
		for (int i = 0; i < shapes.length; i++) {
			if (shapes[i] != null) {
				System.out.println(shapes[i]);
			}
		}
	}
}
