#ifndef _rat_h_
#define _rat_h_
using namespace std;

#include <iostream>
#include <string>

class Rational {

public:
	Rational& operator=(Rational e);
	Rational operator+(Rational sum);
	Rational operator++(int);
	Rational operator++();
	Rational operator-(Rational sus);
	Rational operator--(int);
	Rational operator--();
	Rational operator-();
	friend Rational operator*(Rational proI, Rational proII);
	friend Rational operator/(Rational divI, Rational divII);
	Rational operator+=(Rational sume);
	Rational operator-=(Rational suse);
	friend Rational operator*=(Rational proeI, Rational proeII);
	friend Rational operator/=(Rational diveI, Rational diveII);
	friend bool operator==(Rational p, Rational q);
	friend bool operator>(Rational p, Rational q);
	friend bool operator<(Rational p, Rational q);
	friend bool operator>=(Rational p, Rational q);
	friend bool operator<=(Rational p, Rational q);
	friend bool operator!=(Rational p, Rational q);
	friend ostream & operator <<(ostream & os, Rational pt);
	friend istream & operator >>(istream & is, Rational& pt);


	Rational();
	Rational(int xc);
	Rational(int xc, int yc);

	int sim(int num, int den);

	int getN();
	int getD();

	void setN(int v);
	void setD(int v);


private:
	int num,den;
};

#endif //_rat_h_