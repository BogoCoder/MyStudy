#include <iostream>
#include <string>
#include <vector>
#include <stdio.h>
#include <algorithm>
using namespace std;

void orderer(vector<int>& vect, int item);

int temp;

int main()
{
	vector<int> vect;
	int to = 0;
	while(to >= 0 && to < 100)
	{
		printf("Enter a integer[0,99]: ");
		cin >> to;
		orderer(vect, to);	
	}

	for(int i = 0; i < vect.size(); ++i)
	{
		cout << vect[i] << endl;
	}

	
}


void orderer(vector<int>& vect, int item)
{
       std::vector<int>::iterator lmao = std::upper_bound(vect.begin(), vect.end(), item);
       vect.insert(lmao, item);
}