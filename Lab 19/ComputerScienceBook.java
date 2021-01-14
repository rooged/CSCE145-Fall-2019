/*
 * Written by JJ Shepherd
 */
public class ComputerScienceBook extends SimpleBook{

	public ComputerScienceBook()
	{
		super();
	}
	public ComputerScienceBook(String aName, String anAuthor, double aCallNumber)
	{
		super(aName,anAuthor,aCallNumber);
	}
	public void setCallNumber(double aCallNumber)
	{
		if(aCallNumber >=0.0 && aCallNumber < 100.0)
			super.setCallNumber(aCallNumber);
	}
	public String toString()
	{
		return "Computer Science\n"+super.toString();
	}
}