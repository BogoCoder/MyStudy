import acm.program.*;
public class EnglishConsonant extends ConsoleProgram
{
	private static final long serialVersionUID = 1L;
	
	public void run() 
	{
		
		for (char ch = 'A'; ch <= 'Z'; ch++)
		{
			String c = Character.toString(ch);
			if(isEnglishConsonant(c) == true)
			{
				println(ch);
			}
		}
	
	}

	public boolean isEnglishConsonant(String ch)
	{
		switch(ch.toLowerCase())
		{
		case "a" : case "e" : case "i" : case "o" : case "u": 
				return false;
		default: 
			return true;
		}
	}
	
}