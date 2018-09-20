#ifndef _rat_h_
#define _rat_h_
using namespace std;

#include <iostream>
#include <string>

class Domino {

public:
	
	friend string to_string(Domino p);
	friend ostream & operator<<(ostream & os, Domino toc);
	friend bool operator==(Domino p, Domino q);
	friend bool operator!=(Domino p, Domino q);
	friend bool operator<(Domino p, Domino q);
	friend bool operator<=(Domino p, Domino q);
	friend bool operator>(Domino p, Domino q);
	friend bool operator>=(Domino p, Domino q);



	Domino();
	Domino(int ac);
	Domino(int ac, int bc);

	int getA();
	int getB();

	void setA(int v);
	void setB(int v);


private:
	int endA,endB;
};

#endif //_point_h_