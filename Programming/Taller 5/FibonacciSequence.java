import acm.program.*;
public class FibonacciSequence extends ConsoleProgram 
{
private static final long serialVersionUID = 1L;

	public void run()
	{
		int ran = readInt("Determine the range of the Fibonacci sequence: ");
		Fibonacci(ran);
	}

	private void Fibonacci(int ran)
	{
		int f0 = 0;
		int f1 = 1;
		int ft = 0;
		for(int i = 0; i <= ran; i++)
		{
			if(i == 0)
			{
				println("F" + i + " = " + f0);
			}
			
			if(i == 1)
			{
				println("F" + i + " = " + f1);
			}
			
			if(i >= 2)
			{
				ft = f0 + f1;
				f0 = f1;
				f1 = ft;
				println("F" + i + " = " + ft);
			}
		}
	}

}
