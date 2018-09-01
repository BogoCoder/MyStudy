import acm.program.*;
import acm.util.*;
public class RandomCards extends ConsoleProgram
{
private static final long serialVersionUID = 1L;

	public void run()
	{
		println("This program displays a randomly chosen card.");
		pause(500);
		println("Chosing...");
		pause(2000);
		println(RANK() + " of " + SUIT());
	}
	
	private String RANK()
	{
		int RR = rgen.nextInt(13);
		String rank;
		if(RR == 0)
		{
			rank = "Ace";
			return rank;
		}
		
		if(RR == 1)
		{
			rank = "2";
			return rank;
		}
		
		if(RR == 2)
		{
			rank = "3";
			return rank;
		}
		
		if(RR == 3)
		{
			rank = "4";
			return rank;
		}
		
		if(RR == 4)
		{
			rank = "5";
			return rank;
		}
		
		if(RR == 5)
		{
			rank = "6";
			return rank;
		}
		
		if(RR == 6)
		{
			rank = "7";
			return rank;
		}
		
		if(RR == 7)
		{
			rank = "8";
			return rank;
		}
		
		if(RR == 8)
		{
			rank = "9";
			return rank;
		}
		
		if(RR == 9)
		{
			rank = "10";
			return rank;
		}
		
		if(RR == 10)
		{
			rank = "Jack";
			return rank;
		}
		
		if(RR == 11)
		{
			rank = "Queen";
			return rank;
		}
		
		if(RR == 12)
		{
			rank = "King";
			return rank;
		}
		
		else
		{
			rank = "None";
			return rank;
		}
	}
	
	
	private String SUIT()
	{
		int S = rgen.nextInt(4);
		String rank;
		if(S == 0)
		{
			rank = "Clubs";
			return rank;
		}
		
		if(S == 1)
		{
			rank = "Diamonds";
			return rank;
		}
		
		if(S == 2)
		{
			rank = "Hearts";
			return rank;
		}
		
		if(S == 3)
		{
			rank = "Spades";
			return rank;
		}	
		
		else
		{
			rank = "None";
			return rank;
		}
	}
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
}
