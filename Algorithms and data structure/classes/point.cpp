#include "point.hpp"
#include <iostream>

bool operator==(Point p, Point q)
{
	return p.x == q.x && p.y == q.y;
}

ostream & operator<<(ostream & os, Point p)
{
	return os << "(" << p.x << "," << p.y << ")";
}

Point::Point()
{
	x = 0;
	y = 0;
}

Point::Point(int xc, int yc)
{
	x = xc;
	y = yc;
}

int Point::getX() {return x;}
int Point::getY() {return y;}

void Point::setX(int v) {x = v;}
void Point::setY(int v) {y = v;}