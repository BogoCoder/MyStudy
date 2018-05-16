import acm.program.*;
import java.util.*;
public class TwoDim extends ConsoleProgram
{
	private static final long serialVersionUID = 1L;
	
	public void run()
	{
		int[][] arrtwo = new int [][] {{2,4},{1,3}};
		println("\nOriginal Array: \n");
		println(Arrays.deepToString(arrtwo));
		println("\nOriginal Array(At 0,2): \n");
		println(arrtwo[0][1]);
		
		println("\nTransposed Array: \n");
		println(Arrays.deepToString(trans(arrtwo)));
		println("\nTransposed Array (At 1,0): \n");
		println(trans(arrtwo)[1][0]);
	}
	
	private int[][] trans(int[][] arrtwo)
	{
		int m = arrtwo.length;
		
		int n = arrtwo[0].length;
		
		int[][] transarr = new int[n][m];
		
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < m ; j++)
			{
				transarr[i][j] = arrtwo[j][i];
			}
		}
		return transarr;
	}
}
