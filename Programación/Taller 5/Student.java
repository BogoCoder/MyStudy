
public class Student
{

	public Student(String name, int id)
	{
		studentName = name;
		studentID = id;
	}
	
	public String getName()
	{
		return studentName;
	}
	
	public int getID()
	{
		return studentID;
	}
	
	public void setCredits(double credits)
	{
		creditsEarned = credits;
	}
	
	public double getCredits()
	{
		return creditsEarned;
	}
	
	public void setPaidUp(boolean flag)
	{
		paidUp = flag;
	}
	
	public boolean isPaidUp()
	{
		return paidUp;
	}
	
	public String toString()
	{
		return studentName + "(#" + studentID + ")";
	}
	
	public static final double CREDITS_TO_GRADUATE = 32.0;
	
	private String studentName;
	private int studentID;
	private double creditsEarned;
	private boolean paidUp;
}
