import acm.program.*;
public class ReadInt extends ConsoleProgram
{
	private static final long serialVersionUID = 1L;
	
	public void run()
	{
		println("This program adds two integers.");
		
		while(true)
			try
			{
			String prompt = readLine("Enter n1: ");
			n1 = myReadInt(prompt);
			break;
			}
			catch(Exception exception)
			{
				println("Illegal integer format");
			}
		
		while(true)
			try
			{
			String prompt = readLine("Enter n2: ");
			n2 = myReadInt(prompt);
			break;
			}
			catch(Exception exception)
			{
				println("Illegal integer format");
			}
		println("The total is " + (n1 + n2) + ".");
	}
	
	private int myReadInt(String prompt)
	{
		for(int i = 0; i < prompt.length(); i++)
		{
			if(Character.isDigit(prompt.charAt(i)) || prompt.charAt(i) == '-' || prompt.charAt(i) == '+')
			{
				newstr += prompt.charAt(i);
			}
			
			else
			{
				newstr = "";
			}
			
			if(prompt.charAt(i) != '-' && prompt.charAt(i) != '+')
			{
				newint = Integer.parseInt(newstr);
			}
		}
		newstr = "";
		return newint;	
	}
	

	
	private static int n1;
	private static int n2;
	private static String newstr = "";
	private static Integer newint;
}
