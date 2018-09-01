import acm.program.*;
public class Scrabble extends ConsoleProgram
{
private static final long serialVersionUID = 1L;
	
	public void run()
	{
		println("This program counts the points of your Scrabble word.");
		String line = readLine(">> ");
		println("This word has: " + Score(line) + " points.");
	}
	
	private int Score(String line)
	{
		int points = 0;
		for(char c = 0; c < line.length(); c++)
		{
			points += ScoreLetter(line.charAt(c));
		}
		
	return points;
	}
	
	private int ScoreLetter(char letter)
	{
		switch(Character.toString(letter))
		{
		case "A" : case "E": case "I": case "L" : case "N" : case "O":
		case "R" : case "S" : case "T" : case "U" : 
			return 1;
		
		case "D" : case "G": 
			return 2;
			
		case "B" : case "C" : case "M" : case "P": 
			return 3;
			
		case "F" : case "H" : case "V" : case "W" : case "Y":
			return 4;
		
		case "K":
			return 5;
		
		case "J" : case "X":
			return 8;
			
		case "Q": case "Z": 
			return 10;
			
		default: return 0;
		}
	}

}
