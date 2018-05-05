import acm.program.*;
public class ExamScores extends ConsoleProgram
{
private static final long serialVersionUID = 1L;
	public void run()
	{
		println("This program adds a list of the exam scores.");
		println("Enter values, one per line, using " + SENTINEL);
		println("to signal the end of the list.");
		double total = 0.0;
		int den = 0;
			while (true)
			{
				double value = readDouble(">> ");
				if (value == SENTINEL) 
				{
					break;
				}
				den++;
				total += value;
			}
			double avg = total/den; 
		println("Your average score is " + avg + ".");
	}
	private static final int SENTINEL = -1;
}
