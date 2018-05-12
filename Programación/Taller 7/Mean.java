import java.util.*;
import acm.program.*;
public class Mean extends ConsoleProgram
{

	private static final long serialVersionUID = 1L;
	
	public void run()
	{
		int[] arr = {1,2,3,4};
		println(Arrays.toString(arr));
		println("The average is: " + meanARR(arr));
		
		println("\n");
		
		ArrayList<Integer> arrlist = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
		println(arrlist);
		println("The average is: " + meanLS(arrlist));
	}
	
	private double meanARR(int[] arr)
	{
		double an = 0.0;
		for(int i = 0; i < arr.length; i++)
		{
			an += arr[i];
		}
		an = an/arr.length;
		return an;
	}
	
	private double meanLS(ArrayList<Integer> arr)
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
