#include <iostream>
#include <string>
#include "point.hpp"
using namespace std;

int main()
{

	Point a(1,3), b(1,4);

	cout << "a = " << a << endl << "b = " << b << endl;
	string msg = a == b ? "" : "not ";
	cout << "Points are " + msg + "equal" << endl;
	return 0;
}