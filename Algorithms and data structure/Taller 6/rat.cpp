#include "rat.hpp"
#include <iostream>

bool operator==(Rational p, Rational q)
{
	return p.num == q.num && p.den == q.den;
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

Rational::Rational(int xc, int yc)
{
	num = xc;
	den = yc;
}

int Rational::getN() {return num;}
int Rational::getD() {return den;}

void Rational::setN(int v) {num = v;}
void Rational::setD(int v) {den = v;}