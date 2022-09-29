
public class WriExam extends PracticalExam
{
	int examDate;
	String subName;
	
	public WriExam()
	{}
 
	public WriExam(int e, String s)
	{
		super("maths", 78);
		examDate=e;
		subName=s;
	}
	
	public void showCaseWriExamDetails()
	{
		System.out.println("Date of written exam:" +examDate);
		System.out.println("Sub name of written exam:" +subName);
	}

}
