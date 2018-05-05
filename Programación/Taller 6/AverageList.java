import acm.program.*;
public class AverageList extends ConsoleProgram
{
private static final long serialVersionUID = 1L;
	public void run()
	{
		println("This program adds a list of the exam scores.");
		println("Enter values, one per line, using a blank space");
		println("to signal the end of the list.");
		double total = 0.0;
		int den = 0;
			while (true)
			{
				String valueS = readLine(">> ");
				if (valueS.equals(SENTINEL) ) 
				{
					break;
				}
				else
				{
				try {
				Double value = Double.parseDouble(valueS);
				den++;
				total += value;
				}
				catch (Exception exception)
				{
					println("ERROR, INVALID VALUE.");
				}
				
				}
			}
			double avg = total/den; 
		println("Your average score is " + avg );
	}
	private static final String SENTINEL = "";
}
