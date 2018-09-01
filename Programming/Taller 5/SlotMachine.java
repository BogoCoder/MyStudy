import acm.program.*;
import acm.util.RandomGenerator;
public class SlotMachine extends ConsoleProgram
{
private static final long serialVersionUID = 1L;


	public void run()
	{
		setSize(500,500);
		pause(500);
		println("Welcome to the SlotMachine!");
		INS();
		GAME(50);
	}

	
	private String RANDOM()
	{
		String OB;
		int RAN = rgen.nextInt(1, 6)		;
		switch(RAN)
		{
		case 1: RAN = 1;
				OB = "CHERRY";
				break;
		case 2: RAN = 2;
				OB = "LEMON";
				break;
		case 3: RAN = 3;
				OB = "ORANGE";
				break;
		case 4: RAN = 4;
				OB = "PLUM";
				break;
		case 5: RAN = 5;
				OB = "BELL";
				break;
		case 6: RAN = 6;
				OB = "BAR";
				break;
	
		default: OB = "None";
				break;
		}
		return OB;
		
	}
	
	private void INS()
	{
		for(;;)
		{
		println("Would you like instructions? (yes/no)");
		String ANS = readLine(">> ");
		if(ANS.equals("yes"))
		{
			pause(500);
			println("Everytime you play you'll lose $1.");
			pause(500);
			println("These are the win combinations: ");
			pause(500);
			println("BAR       BAR      BAR\tpays   $250");
			println("BELL      BELL    BELL/BAR\tpays   $20");
			println("PLUM      PLUM    PLUM/BAR\tpays   $14");
			println("ORANGE   ORANGE   ORANGE/BAR\tpays   $10");
			println("CHERRY   CHERRY   CHERRY\tpays   $10");
			println("CHERRY   CHERRY    ---\tpays   $10");
			println("CHERRY    ---      ---\tpays   $10");
			pause(500);
			break;	
		}
		else if(ANS.equals("no"))
		{
			break;
		}
		}
	}
	
	private void GAME(int money)
	{
		int MONEY = money;
		int DIF;
		for(;;)
		{
			pause(500);
		println("\nYou have $" + MONEY + "." + "   Would you like to play? (yes/no)");
		String ANS2 = readLine(">> ");
			if(ANS2.equals("yes"))
			{
				MONEY--;
				String RAN1 = RANDOM();
				String RAN2 = RANDOM();
				String RAN3 = RANDOM();
				String DEF;
				if(RAN1.equals("BAR") && RAN2.equals("BAR") && RAN3.equals("BAR"))
				{
					DEF = "win";
					MONEY += 250;
					DIF = 250;
				}
				else if(RAN1.equals("BELL") && RAN2.equals("BELL") && (RAN3.equals("BELL") || RAN3.equals("BAR")))
				{
					DEF = "win";
					MONEY += 20;
					DIF = 20;
				}
				else if(RAN1.equals("PLUM") && RAN2.equals("PLUM") && (RAN3.equals("PLUM") || RAN3.equals("BAR")))
				{
					DEF = "win";
					MONEY += 14;
					DIF = 14;
				}
				else if(RAN1.equals("ORANGE") && RAN2.equals("ORANGE") && (RAN3.equals("ORANGE") || RAN3.equals("BAR")))
				{ 
					DEF = "win";
					MONEY += 10;
					DIF = 10;
				}
				else if(RAN1.equals("CHERRY") && RAN2.equals("CHERRY") && RAN3.equals("CHERRY"))
				{ 
					DEF = "win";
					MONEY += 7;
					DIF = 7;
				}
				else if(RAN1.equals("CHERRY") && RAN2.equals("CHERRY"))
				{ 
					DEF = "win";
					MONEY += 5;
					DIF = 5;
				}
				else if(RAN1.equals("CHERRY"))
				{ 
					DEF = "win";
					MONEY += 2;
					DIF = 2;
				}
				else
				{
				DEF = "lose.";
				DIF = 0;
				}
				
				
					if(DEF.equals("win"))
					{
						print(RAN1);
						pause(500);
						print("   " + RAN2);
						pause(500);
						print("   " + RAN3);
						pause(500);
						print("   You " + DEF + " $" + DIF + ".");
					}
					else 
					{
						print(RAN1);
						pause(500);
						print("   " + RAN2);
						pause(500);
						print("   " + RAN3);
						pause(500);
						print("   You " + DEF);
					}
		}
			
			else if(ANS2.equals("no"))
			{
			println("Good luck in your life!");
			pause(1000);
			println("Game over.");
			pause(1000);
			break;
			}
		}
	}
		
	private RandomGenerator rgen = RandomGenerator.getInstance();
}
