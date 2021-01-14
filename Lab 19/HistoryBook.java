/*
 * Written by JJ Shepherd
 */
public class HistoryBook extends SimpleBook{
	public HistoryBook()
	{
		super();
	}
	public HistoryBook(String aName, String anAuthor, double aCallNumber)
	{
		super(aName,anAuthor,aCallNumber);
	}
	public void setCallNumber(double aCallNumber)
	{
		if(aCallNumber >=900.0 && aCallNumber < 1000.0)
			super.setCallNumber(aCallNumber);
	}
	public String toString()
	{
		return "History\n"+super.toString();
	}
}