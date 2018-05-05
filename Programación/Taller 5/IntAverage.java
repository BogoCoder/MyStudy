import acm.program.*;
public class IntAverage extends ConsoleProgram
{
private final static long serialVersionUID=1l;

	public void run()
	{
		println("This program computes the average of four integers");	
		println("The average is " + Average());
	}
	
	private double Average()
	{
		double Enter = 0;
		for(int i = 1; i <= 4; i++)
		{
			double Type = readDouble(">> ");
			Enter = Enter + Type;	
		}
	double Avg = Enter/4;
	return Avg;
	}
}
