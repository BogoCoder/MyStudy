import acm.graphics.*;
import acm.program.*;
public class DrawHouse extends GraphicsProgram
{
private static final long serialVersionUID = 1L;

	public void run()
	{
		setSize(1000,1000);
		pause(100);
		double X = getWidth();
		double XC = X / 2;
		double Y = getHeight();
		double YC = Y / 2;
		add(STRUCTURE(X, Y, XC, YC));	
		add(ROWF(X, Y, XC, YC));
		add(DOOR(X, Y, XC, YC));
		Window1(X, Y, XC, YC);
		Window2(X, Y, XC, YC);
		Window3(X, Y, XC, YC);
		Window4(X, Y, XC, YC);
		add(HANDPULL(X, Y, XC, YC));
	}
	
	
	private GRect STRUCTURE(double X, double Y, double XC, double YC)
	{
		GRect BASE = new GRect(XC/2, YC/1.5, X/2, Y/2);
		return BASE;
	}
	
	private GPolygon ROWF(double X, double Y, double XC, double YC)
	{
		GPolygon TRIANGLE = new GPolygon();
	      TRIANGLE.addVertex(XC, Y/16);
	      TRIANGLE.addVertex(XC/2, YC/1.5);
	      TRIANGLE.addVertex(X - X/4, Y - Y/1.5);
	    return TRIANGLE;
	}
	
	private GRect DOOR(double X, double Y, double XC, double YC)
	{
		GRect DOOR = new GRect(X/2.2, Y - Y/2.5, X/10, Y/4.3);
		return DOOR;
	}
	
	private void Window1(double X, double Y, double XC, double YC)
	{
		GRect WIN1 = new GRect(X/3.2, YC - YC/5.8, X/30, Y/15);
		add(WIN1);
		GRect WIN2 = new GRect(X/2.87, YC - YC/5.8, X/30, Y/15);
		add(WIN2);
		GRect WIN3 = new GRect(X/3.2, YC - YC/30, X/30, Y/15);
		add(WIN3);
		GRect WIN4 = new GRect(X/2.87, YC - YC/30, X/30, Y/15);
		add(WIN4);
	}

	private void Window2(double X, double Y, double XC, double YC)
	{
		GRect WIN1 = new GRect(X/1.63, YC - YC/5.8, X/30, Y/15);
		add(WIN1);
		GRect WIN2 = new GRect(X/1.55, YC - YC/5.8, X/30, Y/15);
		add(WIN2);
		GRect WIN3 = new GRect(X/1.63, YC - YC/30, X/30, Y/15);
		add(WIN3);
		GRect WIN4 = new GRect(X/1.55, YC - YC/30, X/30, Y/15);
		add(WIN4);
	}
	
	private void Window3(double X, double Y, double XC, double YC)
	{
		GRect WIN1 = new GRect(X/3.38, Y - Y/2.6, X/30, Y/15);
		add(WIN1);
		GRect WIN2 = new GRect(X/3.035, Y - Y/2.6, X/30, Y/15);
		add(WIN2);
		GRect WIN3 = new GRect(X/2.75, Y - Y/2.6, X/30, Y/15);
		add(WIN3);
		GRect WIN4 = new GRect(X/3.38, Y - Y/3.15, X/30, Y/15);
		add(WIN4);
		GRect WIN5 = new GRect(X/3.037, Y - Y/3.15, X/30, Y/15);
		add(WIN5);
		GRect WIN6 = new GRect(X/2.75, Y - Y/3.15, X/30, Y/15);
		add(WIN6);
	}
	
	private void Window4(double X, double Y, double XC, double YC)
	{
		GRect WIN1 = new GRect(X/1.68, Y - Y/2.6, X/30, Y/15);
		add(WIN1);
		GRect WIN2 = new GRect(X/1.59, Y - Y/2.6, X/30, Y/15);
		add(WIN2);
		GRect WIN3 = new GRect(X/1.51, Y - Y/2.6, X/30, Y/15);
		add(WIN3);
		GRect WIN4 = new GRect(X/1.68, Y - Y/3.15, X/30, Y/15);
		add(WIN4);
		GRect WIN5 = new GRect(X/1.59, Y - Y/3.15, X/30, Y/15);
		add(WIN5);
		GRect WIN6 = new GRect(X/1.51, Y - Y/3.15, X/30, Y/15);
		add(WIN6);
	}
	
	private GOval HANDPULL(double X, double Y, double XC, double YC)
	{
		GOval HP = new GOval(X/1.9, Y - Y/3.5, 8, 8);
		return(HP);
	}
}
