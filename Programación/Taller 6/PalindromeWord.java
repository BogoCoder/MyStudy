import acm.program.*;
public class PalindromeWord extends ConsoleProgram
{
	private static final long serialVersionUID = 1L;
	
	public void run()
	{
		println("This program checks for word palindromes.");
		while(true)
		{
		String word = readLine(">> ");
		if(isPalindrome(word) == true)
		{
			println("'" + word + "'" + " is a palindrome.");
		}
		
		else 
		{
			println("That's not a palindrome.");
		}
		}
	}
	
	private boolean isPalindrome(String word)
	{
		
		for(int i = 0; i < word.length(); i++)
		{
			word1 += word.charAt(i);
		}
		
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