#ifndef _point_h_
#define _point_h_
using namespace std;

#include <iostream>
#include <string>

class Point {

public:
	friend bool operator==(Point p, Point q);
	friend ostream & operator <<(ostream & os, Point pt);
	Point();
	Point(int xc, int yc);

	int getX();
	int getY();

	void setX(int v);
	void setY(int v);


private:
	int x,y;
};

#endif //_point_h_