//writen by Timothy Gedney

public class ExponentialLine implements Line {

	//accessors
	private double exponent;
	
	//constructors
	public ExponentialLine() {
		this.exponent = 1;
	}
	
	public ExponentialLine(double exponent) {
		this.setExponent(exponent);
	}
	
	//mutators
	public void setExponent(double exponent) {
		this.exponent = exponent;
	}
	
	//accessors
	public double getExponent() {
		return this.exponent;
	}
	
	@Override
	public double getYPoint(double x) {
		double y = Math.pow(x, this.exponent);
		return y;
	}
}
