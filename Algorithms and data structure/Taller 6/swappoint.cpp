#include <iostream>
using namespace std;

void Swap(int * & px, int * & py)
{
//	cout << *px << " " << *py << endl;
	int *tmp = px;
	px = py;
	py = tmp;
//	cout << *px << " " << *py << endl;
}

int main()
{
	int x = 1;
	int y = 2;

	int* px = &x;
	int* py = &y;

	cout << *px << " " <<  *py << endl;
	Swap(px, py);
	cout << *px << " " <<  *py << endl;

	return 0;
}
