/*
 * taller.cpp
 *
 *  Created on: 6/08/2018
 *      Author: vonnewmann
 */
#include <iostream>
#include <string>
using namespace std;

void sizes();
int main()
{
	cout << "Sizes of data types" << endl;
	sizes();
	return 0;
}

void sizes()
{
	int x;
	double y;
	float c;
	string p;
	long a;
	short b;

	cout << "int: ";
	cout << sizeof(x) << endl;

	cout << "long: ";
	cout << sizeof(a) << endl;

	cout << "short: ";
	cout << sizeof(b) << endl;

	cout << "float: ";
	cout << sizeof(c) << endl;

	cout << "double: ";
	cout << sizeof(y) << endl;

	cout << "string: ";
	cout << sizeof(p) << endl;
}


