import acm.program.*;
public class CaesarCipher extends ConsoleProgram
{
	private static final long serialVersionUID = 1L;
	
	public void run()
	{
		setSize(500,500);
		println("This program encodes a message using a Caesar cipher.");
		while(true)
		{
		pause(2000);
		int shift = readInt("\nEnter the number of character position to shift: ");
		String sentence = readLine("Enter a message: ");
		println("Encoded message: " + encodeCaesarCipher(sentence , shift));
		Encoded = "";
		}	
	}
	
	private String encodeCaesarCipher(String str, int shift)
	{
		
		for(int i = 0; i < str.length(); i++)
		{
			if(Character.isLetter(str.charAt(i)) == true)
			{
				if(Character.isLowerCase(str.charAt(i)))
				{
					int enco = (((str.charAt(i) + shift) - 'a') % 26 ) + 'a';
					Encoded += (char) enco;
				}
				
				else if(Character.isUpperCase(str.charAt(i)))
				{
					int enco = (((str.charAt(i) + shift) - 'A') % 26 ) + 'A';
					Encoded += (char) enco;
				}
			}
			else
			{
				Encoded += (char) str.charAt(i);
			}
		}
		return Encoded;
			
	}
	
	private static String Encoded = "";
}
