import acm.program.*;
public class FindDNA extends ConsoleProgram
{
	private static final long serialVersionUID = 1L;
	
	public void run()
	{
		setSize(500,500);
		pause(1000);
		println("This program returns the first index position at which the DNA strand bind onto the second.");
		pause(1000);
		println("If no matching position exists, the program will return -1.");
		pause(1000);
		longDNA = readLine("Enter the large DNA: ");
		while(Analyzer(longDNA) == -1)
		{
			pause(1000);
			longDNA = readLine("Enter the large DNA: ");
		}
		pause(500);
		println("This is your long DNA: " + "'" + longDNA + "'");
		pause(1000);
		shortDNA = readLine("Enter the short DNA: ");
		while(Analyzer(shortDNA) == -1)
		{
			pause(1000);
			shortDNA = readLine("Enter the short DNA: ");
		}
		println("The index of the first matching position is: " + findFirstMatchingPosition(shortDNA, longDNA));
	}
	
	private int findFirstMatchingPosition(String shortDNA, String longDNA)
	{
		for(int i = 0; i < shortDNA.length(); i++)
		{
			translator(shortDNA.charAt(i));
		}
		
		int part1 = 0;
		int part2 = shortDNA.length();
		int index = -1;
		for(int c = 0; c < longDNA.length(); c++)
		{
			if(part2 <= longDNA.length() )
			{
			String parts = longDNA.substring(part1, part2);
			boolean analy = trans.equals(parts);
			if(analy)
			{
				index = c;
				break;
			}
			
			else
			{
				part1++;
				part2++;
			}
			}
		}
		return index;
	}
	
	private String translator(char shortDNA)
	{
		switch(shortDNA)
		{
		case 'A': trans += 'T'; break;
		case 'C': trans += 'G'; break;
		case 'G': trans += 'C'; break;
		case 'T':	trans += 'A'; break;
		}
	return trans;
	}
	
	private int Analyzer(String DNA)
	{
		for(int i = 0; i < DNA.length(); i++)
		{
			if(Character.isLetter(DNA.charAt(i)) == false)
			{
				if(Character.isWhitespace(DNA.charAt(i)))
					{
						println("The program doesn't allow white spaces characters.");
						return -1;
					}
				println("The DNA strand must have only base letters.");
				return -1;
			}
			
			else if(Character.isLowerCase(DNA.charAt(i)))
			{
				DNA += Character.toUpperCase(DNA.charAt(i));
			}
			
			if(DNA.charAt(i) != 'A' && DNA.charAt(i) != 'C' && DNA.charAt(i) != 'G' && DNA.charAt(i) != 'T')
			{
				println("The program only allows DNA strands.");
				return -1;
			}
		}
		return 1;
	}
	
	private static String trans = "";
	private static String longDNA;
	private static String shortDNA;
}
