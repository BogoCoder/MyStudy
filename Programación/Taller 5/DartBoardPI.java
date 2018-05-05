import acm.program.*;
import acm.util.RandomGenerator;
public class DartBoardPI extends ConsoleProgram
{
private static final long serialVersionUID = 1L;

	public void run()
	{
		println("This program aproximates the value of PI according to the Montecarlo Integration: ");
		int range = readInt("Enter the range of your aproximation of PI: ");
		double PI = DartBoard(range) * 4;
		println("Our aproximation of PI is: " + PI);
	}
	
	private double DartBoard(int n)
	{
		double ASQU = 0;
		double ACIR = 0;
		for(int i = 1; i <= n; i++)
		{
		double firstx = rgen.nextDouble(-1, 1);
		double firsty = rgen.nextDouble(-1, 1);
		ASQU = ASQU + 1.0;
		
		double EXPRE = Math.pow(firstx, 2) + Math.pow(firsty, 2);
		
			if(EXPRE < 1)
				{
					ACIR = ACIR + 1.0;
				}
		}
		double PI4 = ACIR/ASQU;
		return PI4;
	}
	private RandomGenerator rgen = RandomGenerator.getInstance();
}
