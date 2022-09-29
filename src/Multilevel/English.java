package Multilevel;

public class English extends TextBook
{
	String author;
	int cost;

    public English() {}
	
	public English(String a, int c)
	{
		super("maths", 200);
		author=a;
		cost=c;
	}
	
	public void showEnglishDetails()
	{
		showBookDetails();
		showTextBookDetails();
		System.out.println("English book author:"+author);
		System.out.println("cost of Book:"+cost);
	}
	
	/*public String toString()
	{
		return " English book author  :"+author+
				" \n cost of Book :"+cost;
	}*/
}


