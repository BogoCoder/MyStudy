import acm.program.*;
import acm.util.*;
public class MathOctalQuiz extends ConsoleProgram
{
private static final long serialVersionUID = 1L;

	public void run()
	{
		setSize(500,500);
		println("Welcome to MathOctalQuiz.");
		for(int a = 0; a <= 5; a++)
		{
		RandomOP();
		}
		pause(500);
		println("You finished the quiz.");
	
	}
	
	private void GeneAD()
	{
		int a = rgen.nextInt(0,20);
		int b = rgen.nextInt(0, 20 - a);
		pause(500);
		int RES = readInt("What is " + a + " + " + b + " in base 8?" + "   >> ");
		String RESPU = Integer.toString(RES);
		Integer RESPU8 = Integer.parseInt(RESPU, 8);
		for(int i = 0; i < 2; i++)
		{
		if(RES == (RESPU8))
		{
			println(RandomCongrats());
			break;
		}
		else
		{
			RES = readInt("That's incorrect -- try a different answer: ");
		}
		}
		if(RES != (RESPU8))
		{
			println("No, the answer is " + (RESPU8));
		}
	}
	
	private void GeneSUS()
	{
		int a = rgen.nextInt(0,20);
		int b = rgen.nextInt(0, a);
		pause(500);
		int RES = readInt("What is " + a + " - " + b + " in base 8?" + "   >> ");
		String RESPU = Integer.toString(RES);
		Integer RESPU8 = Integer.parseInt(RESPU, 8);
		for(int i = 0; i < 2; i++)
		{
		if(RES == (RESPU8))
		{
			println(RandomCongrats());
			break;
		}
		else
		{
			RES = readInt("That's incorrect -- try a different answer: ");
		}
		}
		if(RES != (RESPU8))
		{
			println("No, the answer is " + (RESPU8));
		}
		
	}
	
	private void RandomOP()
	{
		boolean DETER = rgen.nextBoolean();
		if(DETER)
		{
			GeneAD();
		}
		else
		{
			GeneSUS();
		}
	}
	
	private String RandomCongrats()
	{
		int VAR = rgen.nextInt(1, 3);
		String Congrats;
		switch(VAR)
		{
		case 1: VAR = 1;
				Congrats = "Congrats!";
				break;
		case 2: VAR = 2;
				Congrats = "That's the answer!";
				break;
		case 3: VAR = 3;
				Congrats = "That's right!";
				break;
		default: Congrats = "Yey!";
		}
		
		return Congrats;
	}
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
}