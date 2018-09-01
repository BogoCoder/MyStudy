import acm.program.*;
public class Divisible extends ConsoleProgram
{
private static final long serialVersionUID = 1L;

	public void run()
	{
		println("This program will print the numbers between 1 and 100 that are divisible by either 6 or 7 but not both. \n");
		div();
	}
	
	private void div()
	{
		for(int i = 1; i <= 100; i++)
		{
			if(i % 6 == 0 && i % 7 != 0 || i % 6 != 0 && i % 7 == 0)
			{
				println(i);
			}
		}
	}
}
