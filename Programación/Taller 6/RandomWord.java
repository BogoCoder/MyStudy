import acm.program.*;
import acm.util.RandomGenerator;
public class RandomWord extends ConsoleProgram
{
	private static final long serialVersionUID = 1L;
	
	public void run()
	{
		for(int i = 0; i <= 5; i++)
		{
			println(randomWord());
		}
	}
	
	private String randomWord()
	{
		int length = rgen.nextInt(MIN_LETTERS, MAX_LETTERS);
		String word = "";
		
		for(int i = 0; i < length; i++)
		{
			char m = AL.charAt(rgen.nextInt(54));
			word += m;
		}
		return word;
	}
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private static String AL = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz";
	private static int MIN_LETTERS = 1;
	private static int MAX_LETTERS = 10;
}
