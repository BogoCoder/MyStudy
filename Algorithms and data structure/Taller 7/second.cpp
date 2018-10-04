#include <iostream>
using namespace std;

int main()
{
	int integer, &refInt = integer;
	integer = 5;
	refInt = 10;
	//the references of the int refInt is the same of the int integer, thus, when we change the value of refInt, we change the value of integer.
	cout << &integer << "\t" << &refInt << endl;
	return 0;
}