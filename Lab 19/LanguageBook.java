/*
 * Written by JJ Shepherd
 */
public class LanguageBook extends SimpleBook{
	public LanguageBook()
	{
		super();
	}
	public LanguageBook(String aName, String anAuthor, double aCallNumber)
	{
		super(aName,anAuthor,aCallNumber);
	}
	public void setCallNumber(double aCallNumber)
	{
		if(aCallNumber >=400.0 && aCallNumber < 500.0)
			super.setCallNumber(aCallNumber);
	}
	public String toString()
	{
		return "Language\n"+super.toString();
	}
}