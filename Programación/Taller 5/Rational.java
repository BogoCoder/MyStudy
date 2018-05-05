import java.math.*;
public class Rational
{
	public Rational()
	{
		this(0);
	}
	
	public Rational(int n)
	{
		this(n, 1);
	}
	
	public Rational(int x, int y)
	{
		int g = gcd(Math.abs(x), Math.abs(y));

		int num1;
		int den1;
		num1 = x/g;
		den1 = Math.abs(y) / g;
		num = BigInteger.valueOf(num1);
		den = BigInteger.valueOf(den1);
		if (y < 0) 
			{
			num1 = -num1;
			num = BigInteger.valueOf(num1);
			}
	}
	
	public Rational add(Rational r)
	{
		return new Rational (this.num.intValue() * r.den.intValue() + r.num.intValue() * this.den.intValue(), this.den.intValue() * r.den.intValue());
	}
	
	public Rational subtract(Rational r)
	{
		return new Rational(this.num.intValue() * r.den.intValue() - r.num.intValue() * this.den.intValue(), this.den.intValue() * r.den.intValue());
	}
	
	public Rational multiply(Rational r)
	{
		return new Rational(this.num.intValue() * r.den.intValue(), this.den.intValue() * r.num.intValue());
	}
	
	public Rational divide(Rational r)
	{
		return new Rational(this.num.intValue() * r.den.intValue(), this.den.intValue() * r.num.intValue());
	}
	
	public String toString()
	{
		if(den.intValue() == 1) 
		{
			return "" + num;
		}
		else
		{
			return num + "/" + den;
		}
	}
	
	private int gcd(int x, int y)
	{
		int r = x % y;
		while (r != 0)
		{
			x = y;
			y = r;
			r = x % y;
		}
		return y;
	}
	private BigInteger num;
	private BigInteger den;
}
