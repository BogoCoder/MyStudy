#include <iostream>
#include <string>
#include <vector>
#include <stdio.h>
#include <algorithm>
using namespace std;

void orderer(vector<int>& vect, int index);

int main()
{
	vector<int> vect;
	int to = 0;
	int unsigned count = -1; 
	while(to >= 0 && to < 100)
	{
		printf("Enter a integer[0,99]: ");
		cin >> to;
		vect.push_back(to);
		orderer(vect, count);
		++count;
	}

	for(int i = 0; i < vect.size(); ++i)
	{
		cout << vect[i] << endl;
	}
}


void orderer(vector<int>& vect, int count)
{
	if(vect.size() > 1)
	{
		for(int i = count; i < vect.size() - 1 ; ++i)
		{
			if(vect[i] - vect[i + 1] < 0)
			{
				swap(vect[i + 1], vect[i]);
			}
		}
	}
}