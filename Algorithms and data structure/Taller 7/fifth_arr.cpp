#include <iostream>
using namespace std;

int const DIM = 10;
int* createIndexArray(int k);

int main()
{
	int *ptr = createIndexArray(DIM);
	for(int i= 0; i < DIM; ++i) cout << ptr[i] << endl;
	delete[] ptr;
	return 0;
}

template <typename dataType>
struct Cell 
{
	dataType content;
	Cell *link;
};

int* createIndexArray(int k)
{
	int * arrint = new int[k];
	int * finx = arrint;
	for(int o = 0; o < k; ++o) 
		{
			arrint[o] = o;
		}
	return finx;
}
