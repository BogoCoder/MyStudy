import acm.graphics.*;
import acm.program.*;
import java.awt.*;
public class Target extends GraphicsProgram
{
private static final long serialVersionUID = 1L;


	public void run()
	{
		setSize(500,200);
		pause(50);
		double cx = getWidth() / 2;
		double cy = getHeight() / 2;
		Color COLOR1 = new Color(153, 0 ,0);
		Color COLORC = new Color(153, 0, 0);
		Color COLOR2 = new Color(255, 255, 255);
		double RANGE = OUTER_RADIUS;
		
		for(int i = 1; i <= N_CIRCLES; i++) 
			
		{
			if(i == N_CIRCLES)
			{
				RANGE = INNER_RADIUS;
			}
			
		add(createFilledCircle(cx, cy, RANGE, COLOR1));
		
		COLOR1 = COLOR2;
		COLOR2 = COLORC;
		COLORC = COLOR1;
		RANGE = RANGE - (75 / N_CIRCLES);
		
		}
		
	}
	
	private GOval createFilledCircle(double x, double y, double r, Color color)
	
	{
		GOval circle = new GOval (x - r, y - r, 2 * r, 2 * r);
		circle.setColor(color);
		circle.setFilled(true);
		return circle;
	}
	
	private static final int N_CIRCLES = 5;
	private static final double  OUTER_RADIUS = 75;
	private static final double INNER_RADIUS = 10;
}
