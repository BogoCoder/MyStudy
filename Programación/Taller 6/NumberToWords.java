import acm.program.*;
public class NumberToWords extends ConsoleProgram
{
	private static final long serialVersionUID = 1L;
	
	
	public void run()
	{
		setSize(500,500);
		while(true) {
		int n = readInt("Enter a integer: ");
		println(numberToWords(n));
		ones = "";
		tens = "";
		tentwen = "";
		hundreds = "hundred";
		thousands = "thousand";
		converted = "";
		comp = "";
		comp0 = "";
		compare = 0;
		}
	}
	
	private String numberToWords(int n)
	{
		int lenght = String.valueOf(n).length();
		String nstr = Integer.toString(n);
	////////////////////////////////////////////	
		if(lenght == 1)
		{
			compONES(nstr.charAt(0));
			converted = ones;
			return converted;
		}
		
	///////////////////////////////////////////	
		if(lenght == 2)
			{
			if(n > 10 && n < 20)
			{
				compTENTWEN(n);
				converted = tentwen;
				return converted;
			}
			else
			{
			for(int i = 0; i < lenght; i++)
			{
				if(i == 0)
				{
					compTENS(nstr.charAt(i));
					converted = tens;
				}
				else if(i == 1 && nstr.charAt(i) != '0')
				{
					compONES(nstr.charAt(i));
					converted += " " +ones;
				}
			}
			}
			return converted;
			}
			
	/////////////////////////////////////////////
		if(lenght == 3)
			{
			for(int i = 0; i < lenght; i++)
			{
				if(i == 0)
				{
					compONES(nstr.charAt(i));
					converted = ones + " " + hundreds;
				}
				
				else if(i == 1 && nstr.charAt(i) != '0' && nstr.charAt(i) != '1')
				{
					compTENS(nstr.charAt(i));
					converted = ones + " " + hundreds + " " + tens;
				}
				
					else if(i == 1 && (nstr.charAt(i) == '0' || nstr.charAt(i) == '1'))
					{
						comp += nstr.charAt(i);
						comp += nstr.charAt(i + 1);
						compare = Integer.parseInt(comp);
						if(compare > 10 && compare < 20)
						{
						compTENTWEN(compare);
						converted += " " + tentwen;
						}
						else
						{
							for(int c = 0; c < comp.length(); c++)
							{
								if(c == 0 && comp.charAt(c) != '0')
								{
									compTENS(comp.charAt(c));
									converted += " " + tens;
								}
								else if(c == 1 && comp.charAt(c) != '0')
								{
									compONES(comp.charAt(c));
									converted += " " +ones;
								}
							}
						}
					}
				else if(i == 2 && nstr.charAt(i) != '0' && nstr.charAt(i - 1) != '1' && nstr.charAt(i - 1) != '0')
				{
					compONES(nstr.charAt(i));
					converted += " " +ones;
				}
			}
			return converted;
			}
		
	//////////////////////////////////////////////
		if(lenght == 4)
			{
			for(int i = 0; i < lenght; i++)
			{
				if(i == 0)
				{
					compONES(nstr.charAt(i));
					converted = ones + " " + thousands;
				}
				
				else if(i == 1 && nstr.charAt(i) != '0')
				{
					compONES(nstr.charAt(i));
					converted += " " + ones + " " + hundreds;
				}
				
				else if(i == 2 && nstr.charAt(i) != '0' && nstr.charAt(i) != '1')
				{
					compTENS(nstr.charAt(i));
					converted += " " + tens;
				}
					else if(i == 2 && (nstr.charAt(i) == '0' || nstr.charAt(i) == '1'))
					{
						comp += nstr.charAt(i);
						comp += nstr.charAt(i + 1);
						compare = Integer.parseInt(comp);
						if(compare > 10 && compare < 20)
						{
						compTENTWEN(compare);
						converted += " " + tentwen;
						}
						else
						{
							for(int c = 0; c < comp.length(); c++)
							{
								if(c == 0 && comp.charAt(c) != '0')
								{
									compTENS(comp.charAt(c));
									converted += " " + tens;
								}
								else if(c == 1 && comp.charAt(c) != '0')
								{
									compONES(comp.charAt(c));
									converted += " " +ones;
								}
							}
						}
					}
				else if(i == 3 && nstr.charAt(i) != '0' && nstr.charAt(i - 1) != '1' && nstr.charAt(i - 1) != '0')
				{
					compONES(nstr.charAt(i));
					converted += " " +ones;
				}
			}
			return converted;
			}
		
	//////////////////////////////////////////////////////
		if(lenght == 5)
			{
			for(int i = 0; i < lenght; i++)
			{
				if(i == 0 && nstr.charAt(i) != '0' && nstr.charAt(i) != '1')
				{
					if(i == 0 && nstr.charAt(i + 1) == '0' ) 
					{
					compTENS(nstr.charAt(i));
					converted = tens + " " + thousands;
					}
					
					else
					{
						compTENS(nstr.charAt(i));
						converted = tens + "-";
					}
				}
					else if(i == 0 && (nstr.charAt(i) == '0' || nstr.charAt(i) == '1'))
					{
						comp0 += nstr.charAt(i);
						comp0 += nstr.charAt(i + 1);
						compare = Integer.parseInt(comp0);
						if(compare > 10 && compare < 20)
						{
							compTENTWEN(compare);
							converted = tentwen + " " + thousands;
						}
						else
						{
							for(int c = 0; c < comp0.length(); c++)
							{
								if(c == 0 && comp0.charAt(c) != '0')
								{
									compTENS(comp0.charAt(c));
									converted += tens + " " + thousands;
								}
								else if(c == 1 && comp0.charAt(c) != '0')
								{
									compONES(comp0.charAt(c));
									converted += " " +ones;
								}
							}
						}
					}
				
				if(i == 1 && nstr.charAt(i) != '0' && nstr.charAt(i - 1) != '1' && nstr.charAt(i - 1) != '0')
				{
					compONES(nstr.charAt(i));
					converted += ones + " " + thousands;
				}
				
				else if(i == 2 && nstr.charAt(i) != '0')
				{
					compONES(nstr.charAt(i));
					converted += " " + ones + " " + hundreds;
				}
				
				else if(i == 3 && nstr.charAt(i) != '0' && nstr.charAt(i) != '1')
				{
					compTENS(nstr.charAt(i));
					converted += " " + tens;
				}
					else if(i == 3 && (nstr.charAt(i) == '0' || nstr.charAt(i) == '1'))
					{
						comp += nstr.charAt(i);
						comp += nstr.charAt(i + 1);
						compare = Integer.parseInt(comp);
						if(compare > 10 && compare < 20)
						{
						compTENTWEN(compare);
						converted += " " + tentwen;
						}
						else
						{
							for(int c = 0; c < comp.length(); c++)
							{
								if(c == 0 && comp.charAt(c) != '0')
								{
									compTENS(comp.charAt(c));
									converted += " " + tens;
								}
								else if(c == 1 && comp.charAt(c) != '0')
								{
									compONES(comp.charAt(c));
									converted += " " +ones;
								}
							}
						}
					}
				else if(i == 4 && nstr.charAt(i) != '0' && nstr.charAt(i - 1) != '1' && nstr.charAt(i - 1) != '0')
				{
					compONES(nstr.charAt(i));
					converted += "-" +ones;
				}
			}
			return converted;
			}
				
		
	/////////////////////////////////////////////////////////////////	
		if(lenght == 6)
			{

			for(int i = 0; i < lenght; i++)
			{
				if(i == 0)
				{
					compONES(nstr.charAt(i));
					converted = ones + " " + hundreds;
				}
				if(i == 1 && nstr.charAt(i) != '0' && nstr.charAt(i) != '1')
				{
					if(i == 1 && nstr.charAt(i + 1) == '0') 
					{
					compTENS(nstr.charAt(i));
					converted +=" " + tens + " " + thousands;
					}
					
					else
					{
						compTENS(nstr.charAt(i));
						converted += " " + tens + "-";
					}
				}
					else if(i == 1 && (nstr.charAt(i) == '0' || nstr.charAt(i) == '1'))
					{
						comp0 += nstr.charAt(i);
						comp0 += nstr.charAt(i + 1);
						compare = Integer.parseInt(comp0);
						if(compare > 10 && compare < 20)
						{
							compTENTWEN(compare);
							converted += " " + tentwen + " " + thousands;
						}
						else
						{
							for(int c = 0; c < comp0.length(); c++)
							{
								if(c == 0 && comp0.charAt(c) != '0')
								{
									compTENS(comp0.charAt(c));
									converted += " " + tens + " " + thousands;
								}
								else if(c == 0 && comp0.charAt(c) == '0')
								{
									converted += " " + thousands;
								}
								else if(c == 1 && comp0.charAt(c) != '0')
								{
									compONES(comp0.charAt(c));
									converted += " " +ones;
								}
							}
						}
					}
				
				if(i == 2 && nstr.charAt(i) != '0' && nstr.charAt(i - 1) != '1' && nstr.charAt(i - 1) != '0')
				{
					compONES(nstr.charAt(i));
					converted += ones + " " + thousands;
				}
				
				else if(i == 3 && nstr.charAt(i) != '0')
				{
					compONES(nstr.charAt(i));
					converted += " " + ones + " " + hundreds;
				}
				
				else if(i == 4 && nstr.charAt(i) != '0' && nstr.charAt(i) != '1')
				{
					compTENS(nstr.charAt(i));
					converted += " " + tens;
				}
					else if(i == 4 && (nstr.charAt(i) == '0' || nstr.charAt(i) == '1'))
					{
						comp += nstr.charAt(i);
						comp += nstr.charAt(i + 1);
						compare = Integer.parseInt(comp);
						if(compare > 10 && compare < 20)
						{
						compTENTWEN(compare);
						converted += " " + tentwen;
						}
						else
						{
							for(int c = 0; c < comp.length(); c++)
							{
								if(c == 0 && comp.charAt(c) != '0')
								{
									compTENS(comp.charAt(c));
									converted += " " + tens;
								}
								else if(c == 1 && comp.charAt(c) != '0')
								{
									compONES(comp.charAt(c));
									converted += " " +ones;
								}
							}
						}
					}
				else if(i == 5 && nstr.charAt(i) != '0' && nstr.charAt(i - 1) != '1' && nstr.charAt(i - 1) != '0')
				{
					compONES(nstr.charAt(i));
					converted += "-" +ones;
				}
			}
			return converted;
			}
		
		else
			{
				converted = "Invalid range";
			}
		return converted;		
	}



	private String compTENS(char a)
	{
		switch(a)
		{
		case '1': tens = "ten"; break;
		case '2': tens = "twenty"; break;
		case '3': tens = "thirty"; break;
		case '4': tens = "fourty"; break;
		case '5': tens = "fifty"; break;
		case '6': tens = "sixty"; break;
		case '7': tens = "seventy"; break;
		case '8': tens = "eighty"; break;
		case '9': tens = "ninety"; break;
		default: tens = "none";
		}
		return tens;
	}
	
	private String compONES(char a)
	{
		switch(a)
		{
		case '0': ones = "zero"; break;
		case '1': ones = "one"; break;
		case '2': ones = "two"; break;
		case '3': ones = "three"; break;
		case '4': ones = "four"; break;
		case '5': ones = "five"; break;
		case '6': ones = "six"; break;
		case '7': ones = "seven"; break; 
		case '8': ones = "eight"; break;
		case '9': ones = "nine"; break;
		default: ones = "none";
		}
		return ones;
	}
	
	private String compTENTWEN(int a)
	{
		switch(a)
		{
		case 11: tentwen = "eleven"; break;
		case 12: tentwen = "twelve"; break;
		case 13: tentwen = "thirteen"; break;
		case 14: tentwen = "fourteen"; break;
		case 15: tentwen = "fifteen"; break;
		case 16: tentwen = "sixteen"; break;
		case 17: tentwen = "seventeen"; break;
		case 18: tentwen = "eighteen"; break;
		case 19: tentwen = "nineteen"; break;
		default: tentwen = "none";
		}
		return tentwen;
	}
	
	private static String ones;
	private static String tens;
	private static String tentwen;
	private static String hundreds = "hundred";
	private static String thousands = "thousand";
	private static String converted = "";
	private static String comp0 = "";
	private static String comp = "";
	private static Integer compare = 0;
}
