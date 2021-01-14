/*
 * Written by JJ Shepherd
 */
public class PhilosophyBook extends SimpleBook{
	public PhilosophyBook()
	{
		super();
	}
	public PhilosophyBook(String aName, String anAuthor, double aCallNumber)
	{
		super(aName,anAuthor,aCallNumber);
	}
	public void setCallNumber(double aCallNumber)
	{
		if(aCallNumber >=100.0 && aCallNumber < 200.0)
			super.setCallNumber(aCallNumber);
	}
	public String toString()
	{
		return "Philosophy\n"+super.toString();
	}
}