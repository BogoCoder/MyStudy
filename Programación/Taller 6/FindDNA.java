import acm.program.*;
public class FindDNA extends ConsoleProgram
{
	private static final long serialVersionUID = 1L;
	
	public void run()
	{
		println(findFirstMatchingPosition("TTGCC", "AACGGTACGTC"));
	}
	
	private int findFirstMatchingPosition(String shortDNA, String longDNA)
	{
		for(int i = 0; i < shortDNA.length(); i++)
		{
			translator(shortDNA.charAt(i));
		}
		
		int part1 = 0;
		int part2 = shortDNA.length() + 1;
		int index = -1;
		for(int c = 0; c < longDNA.length(); c++)
		{
			String parts = longDNA.substring(part1, part2);
			int analy = parts.indexOf(trans);
			if(analy > 0)
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
		println(trans);
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
	
	private static String trans = "";
}
