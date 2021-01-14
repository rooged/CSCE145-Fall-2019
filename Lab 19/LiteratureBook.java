/*
 * Written by JJ Shepherd
 */
public class LiteratureBook extends SimpleBook{
	public LiteratureBook()
	{
		super();
	}
	public LiteratureBook(String aName, String anAuthor, double aCallNumber)
	{
		super(aName,anAuthor,aCallNumber);
	}
	public void setCallNumber(double aCallNumber)
	{
		if(aCallNumber >=800.0 && aCallNumber < 900.0)
			super.setCallNumber(aCallNumber);
	}
	public String toString()
	{
		return "Literature\n"+super.toString();
	}
}