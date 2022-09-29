package Multilevel;

public class TextBook extends Book
{
	String tSub;
	int noOfPages;
	
    public TextBook() {}
	
	public TextBook(String s, int p)
	{
		super(67,89);
		tSub=s;
		noOfPages=p;
	}
	
	public void showTextBookDetails()
	{
		System.out.println("Text Book sub :"+tSub );
		System.out.println("No of pages of text Book:"+noOfPages);
	}
	
	
	/*public String toString()
	{
		return " Text Book subject  :"+tSub+
				" \n No of pages of text Book :"+noOfPages;
	}*/
}


