import acm.program.*;
import acm.util.*;

public class RadioactiveDecay extends ConsoleProgram
{
private static final long serialVersionUID = 1L; 

	public void run()
	{
		int n = 10000;
		Decay(n);
	}
	
	
	private void Decay(int n)
	{
		println("There are " + n + " atoms initially.");
		int ATOMS = n;
		int year = 0;
		while(ATOMS > 0)
		{
			for(int i = ATOMS ; i > 0; i--)
			{
				if(rgen.nextBoolean())
				{
					ATOMS--;
				}
			}
			year++;
			println("There are " + ATOMS + " atoms at the end of the year " + year );	
		}
	}
	
	private RandomGenerator rgen = RandomGenerator.getInstance();

}