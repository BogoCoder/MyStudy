import acm.program.*;
import acm.util.*;
import java.io.*;
public class Greek extends ConsoleProgram
{
	private static final long serialVersionUID = 1L;

	public void run()
	{
		setSize(800,500);
		try
		{
			rd = new BufferedReader(new FileReader("C:\\Users\\samue\\Documents\\greek.txt"));
		}
		catch (IOException e)
		{
			throw new ErrorException("Unable to read");
		}
		printgreek(rd);
	}
	
	private void printgreek(BufferedReader rd)
	{
		try {
			if((actualn = rd.readLine()) == null)
			{
				run();
			}
			
		while(actualn != null)
		{
			wrd = "";
			int random;
			String stran = "";
			for(int i = 0; i < actualn.length(); i++)
			{
				if(Character.isLetter(actualn.charAt(i)))
				{
					if(Character.isUpperCase(actualn.charAt(i)))
					{
						random = rm.nextInt('A', 'Z');
						stran += (char) random;
						wrd += stran;
						stran = "";
					}
					
					else if(Character.isLowerCase(actualn.charAt(i)))
					{
						random = rm.nextInt('a', 'z');
						stran += (char) random;
						wrd += stran;
						stran = "";
					}
				}
				
				else
				{
					wrd += actualn.charAt(i);
				}
			}
			actualn = rd.readLine();
			println(wrd);
		}
		rd.close();
	}
		catch(IOException e)
		{
			throw new ErrorException("Unable to greek");
		}
	}
	
	private static RandomGenerator rm = RandomGenerator.getInstance();
	private static BufferedReader rd;
	private static String actualn;
	private static String wrd;
}
