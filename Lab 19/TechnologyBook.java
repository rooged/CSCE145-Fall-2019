/*
 * Written by JJ Shepherd
 */
public class TechnologyBook extends SimpleBook{
	public TechnologyBook()
	{
		super();
	}
	public TechnologyBook(String aName, String anAuthor, double aCallNumber)
	{
		super(aName,anAuthor,aCallNumber);
	}
	public void setCallNumber(double aCallNumber)
	{
		if(aCallNumber >=600.0 && aCallNumber < 700.0)
			super.setCallNumber(aCallNumber);
	}
	public String toString()
	{
		return "Technology\n"+super.toString();
	}
}