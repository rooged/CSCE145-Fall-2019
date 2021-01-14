//written by Timothy Gedney

public class SimpleBook implements Book {
	
	//attributes
	private String name;
	private String author;
	private double callNumber;
	
	//constructors
	public SimpleBook() {
		this.name = "Color in the Lines";
		this.author = "Tim Gedney";
		this.callNumber = 0;
	}
	
	public SimpleBook(String name, String author, double callNumber) {
		this.setName(name);
		this.setAuthor(author);
		this.setCallNumber(callNumber);
	}
	
	//mutators
	@Override
	public void setName(String name) {
		this.name = name;
		
	}

	@Override
	public void setAuthor(String author) {
		this.author = author;
		
	}
	
	@Override
	public void setCallNumber(double callNumber) {
		if (callNumber < 0) {
			this.callNumber = 0;
		} else {
			this.callNumber = callNumber;
		}
	}

	//accessors
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getAuthor() {
		return this.author;
	}

	@Override
	public double getCallNumber() {
		return this.callNumber;
	}

	//equals method
	@Override
	public boolean equals(Book book) {
		return book != null && this.name.compareToIgnoreCase(book.getName()) == 0 && this.author.compareToIgnoreCase(book.getAuthor()) == 0 && this.callNumber == book.getCallNumber();
	}

	//toString
	@Override
	public String toString() {
		return "Name: " + this.name + "\nAuthor: " + this.author + "\nCall Number: " + this.callNumber;
	}

}
