
public class OralExam extends WriExam
{
	String eTime;
	String eSubType;
	
	public OralExam()
	{}
 
	public OralExam(String tym, String t)
	{
		super(23, "Geography");
		eTime=tym;
		eSubType=t;
	}
	
	public void showCaseOralExamDetails()
	{	
		showCaseExamDetails();
		PracticalExamDetails();
		showCaseWriExamDetails();
		System.out.println("Oral exam time:" +eTime);
		System.out.println("Oral exam type:" +eSubType);
	}

}
