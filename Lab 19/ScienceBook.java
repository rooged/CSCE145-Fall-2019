/*
 * Written by JJ Shepherd
 */
public class ScienceBook extends SimpleBook{
	public ScienceBook()
	{
		super();
	}
	public ScienceBook(String aName, String anAuthor, double aCallNumber)
	{
		super(aName,anAuthor,aCallNumber);
	}
	public void setCallNumber(double aCallNumber)
	{
		if(aCallNumber >=500.0 && aCallNumber < 600.0)
			super.setCallNumber(aCallNumber);
	}
	public String toString()
	{
		return "Science\n"+super.toString();
	}
}