/*
 * Written by JJ Shepherd
 */
public class SocialSciencesBook extends SimpleBook{
	public SocialSciencesBook()
	{
		super();
	}
	public SocialSciencesBook(String aName, String anAuthor, double aCallNumber)
	{
		super(aName,anAuthor,aCallNumber);
	}
	public void setCallNumber(double aCallNumber)
	{
		if(aCallNumber >=300.0 && aCallNumber < 400.0)
			super.setCallNumber(aCallNumber);
	}
	public String toString()
	{
		return "Social Sciences\n"+super.toString();
	}
}