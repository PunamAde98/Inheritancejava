package Multilevel;

public class Book 
{
	int bId;
	int pubId;
	
	public Book() {}
	
	public Book(int bId, int pubId)
	{
		this.bId = bId;
		this.pubId = pubId;
	}
	
	public void showBookDetails()
	{
		System.out.println("Book ID :"+bId );
		System.out.println("Book publication Id:"+pubId);
	}
	
}	
	/*public String toString()
	{
		return "Book ID :"+bId+ " \n Book publication Id:"+pubId;
	}
*/



