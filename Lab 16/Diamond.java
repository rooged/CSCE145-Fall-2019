//written by Timothy Gedney

public class Diamond extends ShapeBasics implements DiamondInterface {

	//attributes
	private int width;
	
	//constructors
	public Diamond() {
		super();
		this.width = 0;
	}
	
	public Diamond(int width, int offset) {
		super(offset);
		this.setWidth(width);
	}
	
	//mutator
	public void setWidth(int width) {
		if (width % 2 == 0 && width > 0) {
			System.out.println("The number is invalid, must be odd.");
			this.width = 0;
		} else {
			this.width = width;
		}
	}
	
	//accessor
	public int getWidth() {
		return this.width;
	}
	
	//drawTopV
	private void drawTopV() {
		int axis = this.getOffset() + (this.width - 1) / 2;
		for (int i = 0; i < (this.width + 1) / 2; i++) {
			for (int j = 0; j < this.getOffset() + this.width; j++) {
				if (j == axis + i || j == axis - i) {
					System.out.print("*");
				} else {
					skipSpaces(1);
				}
			}
			System.out.println();
		}
	}
	
	//drawBottomV
	private void drawBottomV() {
		int axis = this.getOffset() + (this.width - 1) / 2;
		for (int i = (this.width - 1) / 2 - 1; i >= 0 ; i--) {
			for (int j = 0; j < this.width + this.getOffset(); j++) {
				if (j == axis + i || j == axis - i) {
					System.out.print("*");
				} else {
					skipSpaces(1);
				}
			}
			System.out.println();
		}
	}
	
	//drawHere
	public void drawHere() {
		drawTopV();
		drawBottomV();
	}
	
	//skipSpaces
	public static void skipSpaces(int space) {
		for (int i = 0; i < space; i++) {
			System.out.print(" ");
		}
	}
}
