#include "rat.hpp"
#include <iostream>

Rational& Rational::operator=(Rational e)
{
	this->num = e.num;
	this->den = e.den;

	return *this;
}

Rational Rational::operator+(Rational sum)
{
	int tempnum;
	int tempden;
	if(this->den == sum.den)
	{
		tempden = this->den;
		tempnum = this->num + sum.num;
	}

	else
	{
		tempden = this->den * sum.den;
		tempnum = (this->num * sum.den) + (this->den * sum.num);
	}
	
	return Rational(tempnum, tempden);
}

Rational Rational::operator-(Rational sus)
{
	int tempnum;
	int tempden;

	if(den == sus.den)
	{
		tempden = den;
		tempnum = num - sus.num;
	}

	else
	{
		tempden = den * sus.den;
		tempnum = (num * sus.den) - (den * sus.num);
	}
	
	return Rational(tempnum, tempden);
}

Rational operator*(Rational proI, Rational proII)
{
	return Rational(proI.num * proII.num, proI.den * proII.den);
}

Rational operator/(Rational divI, Rational divII)
{
	int tempnum = divI.num * divII.den;
	int tempden = divI.den * divII.num;

	return Rational(tempnum, tempden);
}

Rational Rational::operator+=(Rational sume)
{
	*this = *this + sume;
	return *this;
}

Rational Rational::operator-=(Rational suse)
{
	*this = *this - suse;
	return *this;
}

Rational operator*=(Rational proeI, Rational proeII)
{
	proeI = proeI * proeII;
	return proeI;
}

Rational operator/=(Rational diveI, Rational diveII)
{
	diveI = diveI / diveII;
	return diveI;
}

bool operator==(Rational p, Rational q)
{
	return (p.num * q.den) == (p.den * q.num);
}

bool operator>(Rational p, Rational q)
{
	return (p.num * q.den) > (p.den * q.num);
}

bool operator<(Rational p, Rational q)
{
	return (p.num * q.den) < (p.den * q.num);
}

bool operator>=(Rational p, Rational q)
{
	return (p.num * q.den) > (p.den * q.num) || (p.num * q.den) == (p.den * q.num);
}

bool operator<=(Rational p, Rational q)
{
	return (p.num * q.den) < (p.den * q.num) || (p.num * q.den) == (p.den * q.num) ;
}

bool operator!=(Rational p, Rational q)
{
	return (p.num * q.den) != (p.den * q.num) ;
}

Rational Rational::operator++(int)
{
	Rational tmp = *this;
	num += den;
	return tmp;
}

Rational Rational::operator++()
{
	num += den;
	return *this;
}

Rational Rational::operator--(int)
{
	Rational tmp = *this;
	num -= den;
	return tmp;
}

Rational Rational::operator--()
{
	num -= den;
	return *this;
}

Rational Rational::operator-()
{
	int tempnum = -num;
	return Rational(tempnum, den);
}

ostream & operator<<(ostream & os, Rational pt)
{
	if(pt.den == 1) return os << pt.num;

	else return os << pt.num << "/" << pt.den;
	
}

istream & operator>>(istream & is, Rational& pt)
{
	int I;
	int II;
	is >> I >> II;
	pt.num = I;
	pt.den = II;
	return is;
}

int Rational::sim(int num, int den)
{
	long mcd, tmp, rest;
	mcd = abs(num);
	tmp = den;
	while(tmp > 0)
	{
		rest = mcd % tmp;
		mcd = tmp;
		tmp = rest;
	}

	return mcd;
}

Rational::Rational()
{
	num = 0;
	den = 1; 
}

Rational::Rational(int xc)
{
	num = xc;
	den = 1;
}

Rational::Rational(int xc, int yc)
{
	num = xc / sim(xc, yc);
	den = yc / sim(xc, yc);
}

int Rational::getN() {return num;}
int Rational::getD() {return den;}

void Rational::setN(int v) {num = v;}
void Rational::setD(int v) {den = v;}