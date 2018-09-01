import java.util.*;
import acm.program.*;
public class Swap extends ConsoleProgram
{
	private static final long serialVersionUID = 1L;
	
	public void run()
	{
		int[] arr = {1, 2 , 3 ,4};
		arr[0] = 1;
		println(Arrays.toString(arr));
		swapAR(1, 2, arr);
		println(Arrays.toString(arr));
		
		ArrayList<Integer> arrl = new ArrayList<Integer>();
		arrl.add(1);
		arrl.add(2);
		arrl.add(3);
		arrl.add(4);
		println(arrl);
		swapLIST(1,2, arrl);
		println(arrl);
	}
	
	private void swapAR(int a, int b, int[] arr)
	{
		int tempo = arr[a];
		arr[a] = arr[b];
		arr[b] = tempo;	
	}
	
	private void swapLIST(int a, int b, ArrayList<Integer> arr)
	{
		Collections.swap(arr, a, b);
	}
}
