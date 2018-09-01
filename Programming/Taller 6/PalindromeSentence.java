import acm.program.*;
public class PalindromeSentence extends ConsoleProgram
{
	private static final long serialVersionUID = 1L;
	
	public void run()
	{
		println("This program checks for sentence palindromes.");
		while(true)
		{
		String sentence = readLine("Enter a sentence: ");
		if(isSentencePalindrome(sentence) == true)
		{
			println("'" + sentence + "'" + " is a palindrome.");
		}
		
		else 
		{
			println("That's not a palindrome.");
		}
		word1 = "";
		word2 = "";
		}	
	}
	
	private boolean isSentencePalindrome(String sentence)
	{
		
		for(int i = 0; i < sentence.length(); i++)
		{
			if(Character.isLetter(sentence.charAt(i)) == true)
			{
				word1 += sentence.charAt(i);
			}
		}
		word1 = word1.toLowerCase();
		
		for(int c = word1.length() - 1; c >= 0 ; c--)
		{
			word2 += word1.charAt(c);
		}

		if(word1.equals(word2))
		{
			return true;
		}
		else
		{
			return false;
		}
			
	}
	
	private static String word1 = "";
	private static String word2 = "";
}
