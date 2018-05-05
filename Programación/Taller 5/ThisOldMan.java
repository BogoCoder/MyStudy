import acm.program.*;
public class ThisOldMan extends ConsoleProgram
{
private static final long serialVersionUID = 1L;

	public void run()
	{
		println("This program writes the lyrics of the song 'This old man'. \n");
		int bott = 10;
		bottles(bott);		
	}
	
	private void bottles(int no)
	{
		for(int i = 1; i <= no ; i++)
		{
			int wd = i;
			String rhy = "lol";
			switch(wd)
			{
			case 1: wd = 1;
				rhy = "thumb";
				break;
			case 2: wd = 2;
				rhy = "shoe";
				break;
			case 3: wd = 3;
				rhy = "knee";
				break;
			case 4: wd = 4;
				rhy = "door";
				break;
			case 5: wd = 5;
				rhy = "hive";
				break;
			case 6: wd = 6;
				rhy = "sticks";
				break;
			case 7: wd = 7;
				rhy = "heaven";
				break;
			case 8: wd = 8;
				rhy = "pate";
				break;
			case 9: wd = 9;
				rhy = "spine";
				break;
			case 10: wd = 10;
				rhy = "shin";
				break;
			}
			
			println("This old man he played " + i);
			println("He played knick-knack on my " + rhy);
			println("With a knick-knack, paddy-whack,");
			println("Give your dog a bone.");
			println("This old man came rolling home. \n");
		}
	}
}
