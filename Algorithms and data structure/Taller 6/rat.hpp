#ifndef _rat_h_
#define _rat_h_
using namespace std;

#include <iostream>
#include <string>

class Rational {

public:
	friend bool operator==(Rational p, Rational q);
	friend ostream & operator <<(ostream & os, Rational pt);
	Rational();
	Rational(int xc, int yc);

	int getN();
	int getD();

	void setN(int v);
	void setD(int v);


private:
	int num,den;
};

#endif //_point_h_