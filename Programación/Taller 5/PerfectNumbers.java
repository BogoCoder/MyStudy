import acm.program.*;
public class PerfectNumbers extends ConsoleProgram
{
private static final long serialVersionUID = 1L;

	public void run()
	{
		println("This programs recognize a perfect number.");
		int PER = readInt("Enter a number: "); 
		println(isPerfect(PER));
		
		pause(1000);
		println("Now, the program will recognize the numbers between 1 and 9999.");
		pause(2000);
		
		for(int n = 1; n <= 9999; n++)
		{
			if(isPerfect(n) == true)
				println(n);
		}
	}
	
	private boolean isPerfect(int n)
	{
	int TURN = 0;
		
	for(int j = 1; j < n; j++)
	{
		if(n % j == 0)
		{
			TURN = TURN + j;
		}
	}
		
		
			if(TURN == n)
			{
				return true;
			}	
			else
			{
				return false;
			}
	}

}
