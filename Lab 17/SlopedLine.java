//written by Timothy Gedney

public class SlopedLine implements Line {
	
	//attribute
	private double slope;
	
	//constructor
	public SlopedLine() {
		this.slope = 1;
	}
	
	public SlopedLine(double slope) {
		this.setSlope(slope);
	}
	
	//mutator
	public void setSlope(double slope) {
		this.slope = slope;
	}
	
	//accessor
	public double getSlope() {
		return this.slope;
	}
	
	@Override
	public double getYPoint(double x) {
		double y = this.slope * x;
		return y;
	}
}
