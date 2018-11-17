#include <iostream>
#include <string>
#include <vector>
using namespace std;

void printad(int arr[]);
void printad_help(int arr[], string chosen);
int const DIM = 5;
int main()
{
	int *arr = new int[DIM];
	vector<int> thevec;

	for(int i = 0; i < DIM; ++i)
	{
		cout << "Enter an int: ";
		cin >> arr[i];
	}

	printad(arr);

	//erase arr;
	return 0;
}

void printad(int arr[])
{
	printad_help(arr, "");
}

void printad_help(int arr[], string chosen)
{
	for(int o = 0; o < DIM - 1; ++o)
	{
		cout << arr[o] + arr[o + 1] << endl;
	}
}