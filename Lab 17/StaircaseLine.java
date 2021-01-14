//written by Timothy Gedney

public class StaircaseLine implements Line {
	
	//accessors
		private double width;
		private double height;
		
		//constructors
		public StaircaseLine() {
			this.width = 1;
			this.height = 1;
		}
		
		public StaircaseLine(double width, double height) {
			this.setWidth(width);
			this.setHeight(height);
		}
		
		//mutators
		public void setWidth(double width) {
			this.width = width;
		}
		
		public void setHeight(double height) {
			this.height = height;
		}
		
		//accessors
		public double getWidth() {
			return this.width;
		}
		
		public double getHeight() {
			return this.height;
		}
		
		@Override
		public double getYPoint(double x) {
			double y = ((int) x / (int) this.width) * this.height;
			return y;
		}

}
