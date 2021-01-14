//written by Timothy Gedney

public interface Book {
	
	public void setName(String name);
	
	public void setAuthor(String author);
	
	public void setCallNumber(double callNumber);

	public String getName();
	
	public String getAuthor();
	
	public double getCallNumber();
	
	public boolean equals(Book book);
	
	public String toString();
}
