import acm.program.*;
public class BottlesOfBeer extends ConsoleProgram
{
private static final long serialVersionUID = 1L;

	public void run()
	{
		println("This program writes the lyrics of the song 'bottles of beer'.");
		println("How long do you want the lyrics?");
		int bott = readInt(">> ");
		bottles(bott);		
	}
	
	private void bottles(int no)
	{
		for(int i = no; i <= no && i >= 0; i--)
		{
			if(i == 0)
			{
				println("You don't have bottles now!");
				break;
			}
			println(i + " bottles of beer on the wall.");
			println(i + " bottles of beer.");
			println("You take one down, pass it around.");
		}
	}
}
