import acm.program.*;
import acm.util.*;
import java.io.*;
import java.util.*;
public class WordCount extends ConsoleProgram
{
	private static final long serialVersionUID = 1L;
	
	public void run()
	{
		println("This program reports how many lines, words, and characters appear in a file.");
		BufferedReader rd;
		try {
			rd = new BufferedReader(new FileReader("C:\\loquesea.txt"));
		} catch (FileNotFoundException e) {
			throw new ErrorException("Unable to read");
		}
		countLines(rd);
		countWords(rd);
		countChars(rd);
	}
	
	private void countLines(BufferedReader rd)
	{
		try
		{
		rd = new BufferedReader(new FileReader("C:\\loquesea.txt"));
		int i = 0;
		while(rd.readLine() != null)
		{
			i++;
		}
		println("Number of lines: " + i);
		rd.close();
		}
		catch(IOException exception)
		{
			throw new ErrorException("Unable to count the number of lines.");
		}
	}
	
	private void countWords(BufferedReader rd)
	{
		try {
		rd = new BufferedReader(new FileReader("C:\\loquesea.txt"));
		String ln = rd.readLine();
		int i = 0;
		while(ln != null)
		{
			StringTokenizer tokenizer = new StringTokenizer(ln, " ");
				while(tokenizer.hasMoreTokens() == true)
				{	
					tokenizer.nextToken();
					i++;
				}
			ln = rd.readLine();
		}
		println("Number of words: " + i);
		rd.close();
		}
		catch(IOException exception)
		{
			throw new ErrorException("Unable to count the number of words.");
		}
	}
	
	private void countChars(BufferedReader rd)
	{
		try {
			rd = new BufferedReader(new FileReader("C:\\loquesea.txt"));
			String ln = rd.readLine();
			int i = 0;
			while(ln != null)
			{
					for(int c = 0; c < ln.length(); c++)
					{	
						i++;
					}
				ln = rd.readLine();
			}
			println("Number of characters: " + i);
			rd.close();
			}
			catch(IOException exception)
			{
				throw new ErrorException("Unable to count the number of characters.");
			}
	}

}
