import acm.program.*;
import java.util.*;
public class Find extends ConsoleProgram
{
	private static final long serialVersionUID = 1L;
	
	public void run()
	{
		int[] arr = {1,2,3,4};
		println(Arrays.toString(arr));
		println("The index is: " + findARRAY(arr, 0));
		
		println("\n");
		
		ArrayList<Integer> arrlist = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
		println(arrlist);
		println("The index is: " + findLIST(arrlist, 5));
	}
	
	private int findARRAY(int[] arr, int x)
	{
		int count;
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == x)
			{
				return i;
			}
		}
		count = arr.length + 1;
		return count;
	}
	
	
	private int findLIST(ArrayList<Integer> arrlist, int x)
	{
		int count;
		for(int i = 0; i < arrlist.size(); i++)
		{
			if(arrlist.get(i) == x)
			{
				return i;
			}
		}
		count = arrlist.size() + 1;
		return count;
	}
	
}
