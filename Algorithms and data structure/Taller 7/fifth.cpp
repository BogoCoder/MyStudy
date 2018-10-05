#include <iostream>
using namespace std;

int const DIM = 10;
int* createIndexArray(int k);

int main()
{
	createIndexArray(10);
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
	int arrint[k];
	int * finx = arrint;
	for(int o = 0; o < k; ++o) 
		{
			arrint[o] = o;
		}
	return finx;
}
