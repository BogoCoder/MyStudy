import acm.program.*;
import java.util.*;
public class Acronym extends ConsoleProgram
{
	private static final long serialVersionUID = 1L;
	
	
	public void run()
	{
		String str = readLine(">> ");
		println(acronym(str));
		println(acronymT(str));
	}
	
	private String acronym(String str)
	{
		String result = str.substring(0,1);
		int pos = str.indexOf(' ');
		while (pos != -1)
		{
			result += str.substring(pos + 1, pos +2);
			pos = str.indexOf(' ', pos + 1);
		}
		return result;
	}
	
	private String acronymT(String str)
	{
		StringTokenizer tokenizer = new StringTokenizer(str, DELIMITERS);
		String result = "";
		while(tokenizer.hasMoreTokens())
		{
			String nextT = tokenizer.nextToken();
			result += nextT.substring(0,1);
		}
		return result;
		
	}
	private static final String DELIMITERS = " {},.:;?![]'<>_-|@#$%^&*()";
}
