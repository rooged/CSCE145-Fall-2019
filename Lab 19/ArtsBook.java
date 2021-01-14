/*
 * Written by JJ Shepherd
 */
public class ArtsBook extends SimpleBook{
	public ArtsBook()
	{
		super();
	}
	public ArtsBook(String aName, String anAuthor, double aCallNumber)
	{
		super(aName,anAuthor,aCallNumber);
	}
	public void setCallNumber(double aCallNumber)
	{
		if(aCallNumber >=700.0 && aCallNumber < 800.0)
			super.setCallNumber(aCallNumber);
	}
	public String toString()
	{
		return "Arts\n"+super.toString();
	}
}