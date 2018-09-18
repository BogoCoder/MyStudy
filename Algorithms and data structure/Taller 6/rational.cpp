#include <iostream>
#include "rat.hpp"
using namespace std;


void swap(int *px, int* py);
int main()
{
	Rational ratI(1, 1);
	Rational ratII(5,3);

	cout << "I: " << ratI << endl;
	cout << "II: " << ratII << endl;

	ratI = ratII = Rational(6,3);

	cout << "I = II: I = " << ratI << endl;

	ratI = Rational(1, 2);

	cout << "I = 1/2: I = " << ratI << endl;

	ratI = ratI + Rational(5, 6);

	cout << "I + 5/1: I = " << ratI << endl;
}