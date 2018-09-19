#include <iostream>
#include "rat.hpp"
using namespace std;


void swap(int *px, int* py);
int main()
{
	Rational ratI(142);
	Rational ratII(242,16);
	Rational ratIII;

	cout << "I: " << ratI << endl;
	cout << "II: " << ratII << endl;
	cout << "III: " << ratIII << endl;

	/*ratI = ratII;

	cout << "I = II: I = " << ratI << endl;

	ratI = Rational(1, 2);

	cout << "I = 1/2: I = " << ratI << endl;

	ratI = ratI + Rational(5, 6) - Rational(1,2);

	cout << "I + 5/6: I = " << ratI << endl;

	ratI += Rational(16, 12);

	cout << "I += 16/12: I = " << ratI << endl;

	ratIII = Rational(1, 2) * Rational(3, 2) / Rational(4, 2);

	cout << "III = 1/2 x 3/2 / 1 =  " << ratIII << endl;**/

	cin >> ratIII;
	cout << (ratIII) << endl;

	cout << ratIII++ << endl;
	cout << ++ratIII << endl;
	cout << ratIII-- << endl;
	cout << --ratIII << endl;
	cout << -ratIII << endl;
	cout << ratIII - Rational(18, 6) << endl;


}