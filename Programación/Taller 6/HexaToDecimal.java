import acm.program.*;
public class HexaToDecimal extends ConsoleProgram
{
private static final long serialVersionUID = 1L;

	public void run()
	{
		println("This program converts hexadecimal to decimal.");
		pause(1000);
		println("Enter 0 to stop.");
		pause(1000);
		
		while(true)
		{
		pause(500);
	    String hexValue = readLine("Enter a hexadecimal number: ");
	        if(hexValue.equals("0"))
	        {
	        	println("Thanks!, hope that you had a good convertion.");
	        	pause(1000);
	        	println("Program over.");
	        	break;
	        }
	        else
	        {
	        try {
	        Integer result = Integer.parseInt(hexValue, 16);
	        String result2 = Integer.toString(result);
	        println(hexValue + " hex  =  " + result2 + " decimal");
	        } 
	        catch(Exception exception)
	        {
	        	println("INVALID HEXADECIMAL VALUE!");
	        }
	        }
		}
	}
}
