//written by Timothy Gedney

public class Square {

	private int length;
	
	public Square() {
		this.draw();
	}
	
	public Square(int length) {
		try {
			this.setLength(length);
		} catch (DimensionException e) {
			System.out.print(e.getMessage());
		}
	}
	
	public void setLength(int length) throws DimensionException {
		if (length > 0) {
			this.length = length;
		} else {
			throw new DimensionException("Invalid dimensions.");
		}
	}
	
	public int getLength() {
		return this.length;
	}
	
	public void draw() {
		for (int i = 0; i < this.length; i++) {
			for (int j = 0; j < this.length; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public int getArea() {
		return this.length * this.length;
	}
	
	public int getPerimeter() {
		return this.length * 4;
	}
}
