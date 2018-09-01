import acm.program.*;
import acm.graphics.*;
public class PyramidBricks extends GraphicsProgram
{
private static final long serialVersionUID =1L;

	public void run()
	{	
		setSize(500,500);
		println("This program draws a pyramid of bricks.");
		println("Enter the quantity of rows that you want in your pyramid.");
		int BRICKS_IN_BASE = readInt(">> ");
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
}
