//written by Timothy Gedney

public class SawLine implements Line {
	
	//accessors
		private double modValue;
		
		//constructors
		public SawLine() {
			this.modValue = 1;
		}
		
		public SawLine(double modValue) {
			this.setModValue(modValue);
		}
		
		//mutators
		public void setModValue(double modValue) {
			this.modValue = modValue;
		}
		
		//accessors
		public double getModValue() {
			return this.modValue;
		}
		
		@Override
		public double getYPoint(double x) {
			double y = x % this.modValue;
			return y;
		}

}
