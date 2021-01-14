//written by Timothy Gedney

public class Movie {

	//attributes
	private String name;
	private int year;
	private double rating;
	private String director;
	private double gross;
	
	//default constructor
	public Movie() {
		this.name = "Drive";
		this.year = 2011;
		this.rating = 5.0;
		this.director = "Nicolas Winding Refn";
		this.gross = 81.4;
	}
	
	//parameterized constructor
	public Movie(String name, int year, double rating, String director, double gross) {
		this.setName(name);
		this.setYear(year);
		this.setRating(rating);
		this.setDirector(director);
		this.setGross(gross);
	}
	
	//mutators
	public void setName(String name) {
		this.name = name;
	}
	
	public void setYear(int year) {
		if (year > 1887) {
			this.year = year;
		} else {
			System.out.print("The first film was created in 1888, your year is invalid.");
		}
	}
	
	public void setRating(double rating) {
		if (rating <= 5 && rating >= 1) {
			this.rating = rating;
		} else {
			System.out.print("Rating must be between 1 & 5 stars, your rating is invalid.");
		}
	}
	
	public void setDirector(String director) {
		this.director = director;
	}
	
	public void setGross(double gross) {
		if (gross >= 0) {
			this.gross = gross;
		} else {
			System.out.print("Box office gross must be non-negative, your gross is invalid.");
		}
	}
	
	//accessors
	public String getName() {
		return this.name;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public double getRating() {
		return this.rating;
	}
	
	public String getDirector() {
		return this.director;
	}
	
	public double getGross() {
		return this.gross;
	}
	
	//equals method
	public boolean equals(Movie m) {
		return m != null && this.name.compareToIgnoreCase(m.getName()) == 0 && this.year == m.getYear() && this.rating == m.getRating() && this.director.compareToIgnoreCase(m.getDirector()) == 0 && this.gross == m.getGross();
	}
	
	//toString
	public String toString() {
		return "Name: " + name + ", Year: " + year + ", Rating: " + rating + ", Director: " + director + ", Box Office Gross: $" + gross + " million";
	}
}
