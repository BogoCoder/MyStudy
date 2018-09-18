#include "rat.hpp"
#include <iostream>

bool operator==(Rational p, Rational q)
{
	return p.num == q.num && p.den == q.den;
}

Rational& Rational::operator=(Rational r)
{
	this->setN(r.num);
	this->setD(r.den);

	return *this;
}

Rational& Rational::operator+(Rational sum)
{
	int tempnum;
	int tempden;
	if(this->den == sum.den)
	{
		cout << "true";
		tempden = this->den;
		tempnum = this->num + sum.num;
	}

	else
	{
		tempden = this->den * sum.den;
		tempnum = (this->num * sum.den) + (this->den * sum.num);
	}
	
	this->setN(tempnum);
	this->setD(tempden);
	return *this;
}

ostream & operator<<(ostream & os, Rational pt)
{
	return os << pt.num << "/" << pt.den;
}

Rational::Rational()
{
	num = 0;
	den = 0;
}

Rational::Rational(int xc)
{
	num = xc;
	den = 1;
}

Rational::Rational(int xc, int yc)
{
	num = xc;
	den = yc;
}

int Rational::getN() {return num;}
int Rational::getD() {return den;}

void Rational::setN(int v) {num = v;}
void Rational::setD(int v) {den = v;}