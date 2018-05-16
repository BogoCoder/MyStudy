import acm.program.*;
import java.util.*;
public class Empty extends ConsoleProgram
{
	private static final long serialVersionUID = 1L;
	
	
	public void run()
	{
		int[] arr = new int[0];
		println(Arrays.toString(arr));
		if(emptyARRAY(arr))
		{
			println("The array is empty.");
		}
		else
		{
			println("The arrays isn't empty.");
		}
		
		println("\n");
		
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		println(arrlist);
		if(emptyLIST(arrlist))
		{
			println("The list is empty.");
		}
		else
		{
			println("The list isn't empty.");
		}
		
	}
	
	private boolean emptyARRAY(int[] arr)
	{
		if(arr.length == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	private boolean emptyLIST(ArrayList<Integer> arrlist)
	{
		if(arrlist.size() == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

