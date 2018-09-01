import java.math.BigInteger;
public class RationalBig
{
	
	public static void main(String[] args)
	{
		Rational holi = new Rational(3,5);
		Rational sam = new Rational(1,2);
		Rational lol = holi.add(sam);
		System.out.println(lol);
	}
	public RationalBig()
	{
		this(BigInteger.ZERO);
	}
	
	public RationalBig(BigInteger n)
	{
		this(n, BigInteger.ONE);
	}
	
	public RationalBig(BigInteger x, BigInteger y)
	{
		BigInteger g = gcd(x.abs(), y.abs());
		num = x.divide(g);
		den = y.abs().divide(g);
		int VAL = y.compareTo(BigInteger.ZERO);
		if (VAL == -1) num = BigInteger.valueOf(-1).multiply(num);
	}
	
	public RationalBig add(RationalBig r)
	{
		return new RationalBig (this.num.multiply(r.den).add(r.num).multiply(this.den), this.den.multiply(r.den));
	}
	
	public RationalBig subtract(RationalBig r)
	{
		return new RationalBig(this.num.multiply(r.den).subtract(r.num).multiply(this.den), this.den.multiply(r.den));
	}
	
	public RationalBig multiply(RationalBig r)
	{
		return new RationalBig(this.num.multiply(r.den), this.den.multiply(r.num));
	}
	
	public RationalBig divide(RationalBig r)
	{
		return new RationalBig(this.num.multiply(r.den), this.den.multiply(r.num));
	}
	
	public String toString()
	{
		if(den == BigInteger.ONE) 
		{
			return "" + num;
		}
		else
		{
			return num + "/" + den;
		}
	}
	
	private BigInteger gcd(BigInteger x, BigInteger y)
	{
		BigInteger r = x.mod(y);
		int VAL = r.compareTo(BigInteger.ZERO);
		while (VAL == 1 || VAL == -1)
		{
			x = y;
			y = r;
			r = x.mod(y);
		}
		return y;
	}
	private BigInteger num;
	private BigInteger den;
}
