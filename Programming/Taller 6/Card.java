
public class Card
{

	public Card(int rank, String suit)
	{
		if(rank == ace)
		{
		cardRank = ace;
		}
		else if(rank == jac)
		{
			cardRank = jac;
		}
		else if(rank == que)
		{
			cardRank = que;
		}
		else if(rank == kin)
		{
			cardRank = kin;
		}
		else
		{
			cardRank = 0;
		}
		
		if(suit.equals(CLU))
		{
		cardSuit = CLU;
		}
		else if(suit.equals(DIA))
		{
		cardSuit = DIA;
		}
		else if(suit.equals(HEA))
		{
		cardSuit = HEA;
		}
		else if(suit.equals(SPA))
		{
		cardSuit = SPA;
		}
		else
		{
			cardSuit = "None";
		}
	}
	
	public int getRank()
	{
		return cardRank;
	}
	
	public String getSuit()
	{
		return cardSuit;
	}
	
	public String toString()
	{
		return cardRank + " of " + cardSuit;
	}
	
	public static final double CREDITS_TO_GRADUATE = 32.0;
	
	private String CLU = "Clubs";
	private String DIA = "Diamonds";
	private String HEA = "Hearts";
	private String SPA = "Spades";
	private int ace = 1;
	private int jac = 11;
	private int que = 12;
	private int kin = 13;
	private int cardRank;
	private String cardSuit;
}
