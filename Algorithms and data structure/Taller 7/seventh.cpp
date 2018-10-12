#include <iostream>
using namespace std;

int const DIM = 10;
int main()
{
	char xax = '2';
	double &z = 3.3;
	int x = 5;
	const int * ptr = &x;

	//const int y = 6;

	int *ptr1 = const_cast<int*>(ptr); //returns ptr content with no constness

	int zas = static_cast<int>(z); //returns double z converted to a int, runs in compile time

	int &zaz = dynamic_cast<int&>(z); //returns double z converted to a int, excuted at runtime

	int zax = reinterpret_cast<int>(xax); //compile time directive which instructs the compiler to treat xax as an int


	//ptr = &y;

	//x = 6;


	cout << *ptr1 << endl;
	cout << zas << endl;
	cout << zaz << endl;
	cout << zax << endl;
}
