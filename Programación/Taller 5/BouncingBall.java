import acm.graphics.*;
import acm.program.*;
public class BouncingBall extends GraphicsProgram
{
private static final long serialVersionUID = 1L;

	public void run()
	{
		setSize(400, 200);
		pause(PAUSE_TIME);
		moving();
		
	}
	
	private void moving()
	{
		double canx = getWidth();
		double cany = getHeight();
		double centerx = canx / 2;
		double centery = cany / 2;
		
		GOval ball = new GOval(centerx, centery, BALL_SIZE, BALL_SIZE);
		ball.setFilled(true);
		add(ball);
		
		for (;;)
		{
			ball.move(dx,dy);
			pause(PAUSE_TIME);
			
			double obx = ball.getX() + BALL_SIZE;
			double oby = ball.getY() + BALL_SIZE;
			
			if(obx == canx || obx - BALL_SIZE == 0)
			{
				dx = -(dx);
			}
			if(oby == cany || oby - BALL_SIZE == 0)
			{
				dy = -(dy);
			}
			canx = getWidth();
			cany = getHeight();
		}
		
	}
	
	//private constants
	private static double dx = 1;
	private static double dy = 1;
	private static final int PAUSE_TIME = 10;
	private static final double BALL_SIZE = 50;	
}
