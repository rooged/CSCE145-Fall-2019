//written by Timothy Gedney

public class SineLine implements Line{

	//attributes
	private double amplitude;
	private double frequency;
	
	//constructor
	public SineLine() {
		this.amplitude = 1;
		this.frequency = 1;
	}
	
	public SineLine(double amplitude, double frequency) {
		this.setAmplitude(amplitude);
		this.setFrequency(frequency);
	}
	
	//mutator
	public void setAmplitude(double amplitude) {
		this.amplitude = amplitude;
	}
	
	public void setFrequency(double frequency) {
		this.frequency = frequency;
	}
	
	//accessors
	public double getAmplitude() {
		return this.amplitude;
	}
	
	public double getFrequency() {
		return this.frequency;
	}
	
	@Override
	public double getYPoint(double x) {
		double y = this.amplitude * Math.sin(x * this.frequency);
		return y;
	}
}
