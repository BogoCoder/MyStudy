import java.util.*;
import acm.program.*;
public class Set extends ConsoleProgram
{
	private static final long serialVersionUID = 1L;
	
	public void run()
	{
		int[] arr = {1,2,3,4};
		println(Arrays.toString(arr));
		setARRAY(arr, 7);
		println(Arrays.toString(arr));
		
		println("\n");
		
		ArrayList<Integer> arrlist = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
		println(arrlist);
		setLIST(arrlist, 8);
		println(arrlist);
		}
	
	private void setARRAY(int[] arr, int x)
	{
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = x;
		}
	}
	
	private void setLIST(ArrayList<Integer> arrlist, int x)
	{
		for(int i = 0; i < arrlist.size(); i++)
		{
			arrlist.set(i, x);
		}
	}
}
