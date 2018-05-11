import acm.graphics.*;
import acm.program.*;
import acm.util.*;
import java.io.*;
import javax.swing.*;

public class CrosswordGrid extends GraphicsProgram
{
	private static final long serialVersionUID = 1L;
	
	public void run()
	{
		try
		{
			rd = new BufferedReader(new FileReader("C:\\Users\\samue\\Documents\\FirstCrossword.txt"));
		}
		catch(IOException e)
		{
			throw new ErrorException("You mother");
		}
		Graph(rd);
	}
	
	private void Graph(BufferedReader rd)
	{
		
	int center = 200 + BRICK_WIDTH;
	int xp = center;
	int yp = 30 + BRICK_HEIGHT;
		for(int i = 1; i <= BRICKS_IN_BASE; i++)
		{
			for(int j = 1; j <= i; j++)
				
			{
				
				if(j >= 2)
				{
					xp = xp + ((j * BRICK_WIDTH) - (BRICK_WIDTH/2));	
				}
				
			GRect brick = new GRect (xp, yp , BRICK_WIDTH, BRICK_HEIGHT);
			add(brick);
			xp = xp - ((j * BRICK_WIDTH) - (BRICK_WIDTH/2));
			
			}
			
		yp = yp + BRICK_HEIGHT;
		
		} 
	}
	
	private final static int BRICK_WIDTH = 30;
	private final static int BRICK_HEIGHT = 20;
	private final static int BRICKS_IN_BASE = 20;
	private static RandomGenerator rm = RandomGenerator.getInstance();
	private static BufferedReader rd;
	private static String actualn;
	private static String wrd;
}
