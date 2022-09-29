
public class Exam 
{
	String examType;
	String subName;
	
	public Exam()
	{}
 
	public Exam(String e, String s)
	{
		examType=e;
		subName=s;
	}
	
	public void showCaseExamDetails()
	{
		System.out.println("Type of exam:" +examType);
		System.out.println("Sub name of exam:" +subName);
	}
}
