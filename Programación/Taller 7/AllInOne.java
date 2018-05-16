import java.util.*;
import acm.program.*;
public class AllInOne extends ConsoleProgram
{
	private static final long serialVersionUID = 1L;
	
	public void run()
	{
		setSize(1000,1000);
		int dimarr = readInt("Enter the dimension of the Array: ");
		int[] arr = new int[dimarr];
		includingARR(arr, dimarr);
		println(Arrays.toString(arr));
		
		println("\n///empty\n");
		if(emptyARRAY(arr))
		{
			println("The array is empty.");
		}
		else
		{
			println("The arrays isn't empty.");
		}
		
		if(arr.length > 1)
		{
		println("\n///swap\n");
		swapARR(0, 1, arr);
		println(Arrays.toString(arr));
		}
		
		println("\n///mean\n");
		println("The average is: " + meanARR(arr));
		
		println("\n///stdev\n");
		println("Standard deviation: " + stdevARR(arr));
		
		println("\n///find\n");
		println("The index of a (0) is: " + findARRAY(arr, 0));
		
		println("\n///set (to 7)\n");
		setARRAY(arr, 7);
		println(Arrays.toString(arr));
		
		
		
		println("\n");
		pause(1000);
		
		
		int dimlist = readInt("Enter the dimension of the List: ");
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		includingLIST(arrlist, dimlist);
		println(arrlist);
		
		println("\n///empty\n");
		if(emptyLIST(arrlist))
		{
			println("The array is empty.");
		}
		else
		{
			println("The arrays isn't empty.");
		}
		
		if(arrlist.size() > 1)
		{
		println("\n///swap\n");
		swapLIST(0, 1, arrlist);
		println(arrlist);
		}
		
		println("\n///mean\n");
		println("The average is: " + meanLS(arrlist));
		
		println("\n///stdev\n");
		println("Standard deviation: " + stdevLS(arrlist));
		
		println("\n///find\n");
		println("The index of a (0) is: " + findLIST(arrlist, 0));
		
		println("\n///set (to 7)\n");
		setLIST(arrlist, 7);
		println(arrlist);
		
	}
	
	private double stdevARR(int[] arr)
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
	
	private double stdevLS(ArrayList <Integer> arr)
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
	
	private void swapARR(int a, int b, int[] arr)
	{
		int tempo = arr[a];
		arr[a] = arr[b];
		arr[b] = tempo;	
	}
	
	private void swapLIST(int a, int b, ArrayList<Integer> arr)
	{
		Collections.swap(arr, a, b);
	}
	
	private void includingARR(int[] arr, int dimarr)
	{
		for(int i = 0; i < dimarr; i++)
		{
			int el = readInt("Enter an element: ");
			arr[i] = el;
		}
	}
	
	private void includingLIST(ArrayList<Integer> arrlist, int dimlist)
	{
		for(int i = 0; i < dimlist; i++)
		{
			int el = readInt("Enter an element: ");
			arrlist.add(el);
		}
	}
}
