#include <iostream>
using namespace std;

void bubbleSort(int data[], int count, bool (*cmp)(int, int));
bool ascenSort(int x, int y); // ascending sort
bool descenSort(int x, int y); // descending sort
int const DIM = 10;

int main()
{
	int array[] = {0, 6 , 1 , -3 , 4 , 5 , 8 , 3 , -15, 10};
	bubbleSort(array, DIM, *descenSort);

	for(int o = 0; o < DIM; ++o) cout << array[o] << endl;
	return 0;
}

void bubbleSort(int data[], int count, bool (*cmp)(int, int)) //bubble sort funct
{
	for(int i = 0; i < count - 1; ++i)
	{
		for(int j = 0; j < count - 1; ++j)
		{
			if(cmp(data[j], data[j+1])) // comparator funct
			{
				swap(data[j], data[j+1]);
			}
		}
	}
}

bool ascenSort(int x, int y)
{
	if(x > y) return true;
	else return false;
}

bool descenSort(int x, int y)
{
	if(x < y) return true;
	else return false;
}