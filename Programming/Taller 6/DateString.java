import acm.program.*;
import java.text.*;
public class DateString extends ConsoleProgram
{
	private static final long serialVersionUID = 1L;
	
	public void run()
	{
		println(createDateString(14, 12, 2001));
	}
	
	private String createDateString(int day, int month, int year)
	{
		String Day = Integer.toString(day);
		String Month = Month(month);
		String Year = Year(year);
		
		String date = Day + ", " + Month + ", " + Year;
		
		return date;
			
	}
	
	private String Month(int month)
	{
		String Month = "";
		try
		{
		String M = new DateFormatSymbols().getMonths()[month-1];
		
		for(int i = 0; i < 3; i++)
		{
			Month += M.charAt(i);
		}
		return Month;
		}
		catch(Exception exception)
		{
			Month = "Invalid month";
			return Month;
		}
	}

	private String Year(int year)
	{
		String age = "";
		try
		{
		String yearS = Integer.toString(year);
		
		for(int i = 2; i < 4; i++)
		{
			age += yearS.charAt(i);
		}
		
		return age;
		}
		catch(Exception exception)
		{
			age = "Invalid year";
			return age;
		}
	}
	
	
}
