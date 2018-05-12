import acm.program.*;
import java.util.*;
public class Stdev extends ConsoleProgram
{
private static final long serialVersionUID = 1L;

	public void run()
	{
		double[] arr = {1,2,3,4};
		println(Arrays.toString(arr));
		println("Standard deviation: " + stdevARR(arr));
		
		println("\n");
		
		ArrayList<Double> arrlist = new ArrayList<Double>(Arrays.asList(1.0,2.0,3.0,4.0));
		println(arrlist);
		println("Standard deviation: " + stdevLS(arrlist));
		
	}
	
	private double stdevARR(double[] arr)
	{
		double avg = meanARR(arr);
		double first = 1/ (arr.length - 1.0);
		double second = 0;
			for(int i = 0; i < arr.length; i++)
			{
				second += Math.pow((arr[i] - avg), 2);
			}
		double thirt = first * second;
		double fourth = Math.sqrt(thirt);
		return fourth;
	}
	
	private double stdevLS(ArrayList <Double> arr)
	{
		double avg = meanLS(arr);
		double first = 1/ (arr.size() - 1.0);
		double second = 0;
			for(int i = 0; i < arr.size(); i++)
			{
				second += Math.pow((arr.get(i) - avg), 2);
			}
		double thirt = first * second;
		double fourth = Math.sqrt(thirt);
		return fourth;
	}
	
	private double meanARR(double[] arr)
	{
		double an = 0.0;
		for(int i = 0; i < arr.length; i++)
		{
			an += arr[i];
		}
		an = an/arr.length;
		return an;
	}
	
	private double meanLS(ArrayList<Double> arr)
	{
		double an = 0.0;
		for(int i = 0; i < arr.size(); i++)
		{
			an += arr.get(i);
		}
		an = an/arr.size();
		return an;
	}
}
