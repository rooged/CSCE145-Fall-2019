/*
 * Written by JJ Shepherd
 */
public class ReligionBook extends SimpleBook{
	public ReligionBook()
	{
		super();
	}
	public ReligionBook(String aName, String anAuthor, double aCallNumber)
	{
		super(aName,anAuthor,aCallNumber);
	}
	public void setCallNumber(double aCallNumber)
	{
		if(aCallNumber >=200.0 && aCallNumber < 300.0)
			super.setCallNumber(aCallNumber);
	}
	public String toString()
	{
		return "Religion\n"+super.toString();
	}
}