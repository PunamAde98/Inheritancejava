
public class PracticalExam extends Exam
{
	String topic;
	int outOfMarks;
	
	public PracticalExam() 
	{
		
	}
	
	public PracticalExam(String t, int m)
	{
		super("MCQ", "INHERITANCE");
		topic=t;
		outOfMarks=m;
	}
	
	public void PracticalExamDetails()
	{
		//showCaseExamDetails();
		System.out.println("Topic of practical exam:" +topic);
		System.out.println("Out of marks of practical exam:" +outOfMarks);
		
	}

}
