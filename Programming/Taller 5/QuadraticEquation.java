import acm.program.*;
public class QuadraticEquation extends ConsoleProgram
{
private static final long serialVersionUID = 1L;

	public void run()
	{
		println("Enter coefficients for the quadratic equation: ");
		QUA();
	}
	
	
	private void QUA()
	{
		double a = readDouble("a: ");
		
			while(a == 0)
			{
				println("The 'a' cannot be a zero!");
				a = readDouble("a: ");
			}
			
		double b = readDouble("b: ");
		double c = readDouble("c: ");
		double R = Math.pow(b, 2) - 4*a*c;
		double XP = (-b + Math.sqrt(R)) / (2*a);
		double XN = (-b - Math.sqrt(R)) / (2*a);
		
		
			if(R < 0)
			{
				println("The equation has no real solutions because the quantity under the square root sign is negative.");
			}
			else
			{
				println("The first solution is: " + XP);
				println("The second solution is: " + XN);
			}
	}
}
