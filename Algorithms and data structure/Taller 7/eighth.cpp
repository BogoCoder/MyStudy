#include <iostream>
using namespace std;

int const DIM = 10;
int main()
{
	 int x = 5;
	const int * ptr = &x;

	const int y = 6;

	int *ptr1 = const_cast<int*>(ptr); //returns ptr content with no constness
	//ptr = &y;

	//x = 6;

	cout << *ptr1 << endl;
}
