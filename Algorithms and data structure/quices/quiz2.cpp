#include <iostream>
#include <string>
#include <vector>
#include <stdio.h>
#include <algorithm>
#include <stack>
using namespace std;

void zerosN2(vector<int>& vect);
void zerosN(vector <int>& vect);

int main()
{
	vector<int> vect = {0,1,0,5,6,0,2,6,7,0,5,0,1,5,4,3,4,6,5,78,9,7,1,32,4,6,98,7,5,1,0,5,0,5,4,0,6,0,4,0,4,6,0};

	zerosN(vect);

	for(int i = 0; i < vect.size(); ++i)
	{
		cout << vect[i] << endl;
	}
}


//*completed N2 function
void zerosN2(vector <int>& vect)
{
	for(int i = 0; i < vect.size(); ++i)
	{
		if(vect[i] == 0)
		{
			for(int j = i; j < vect.size(); ++j)
			{
				if(vect[j] !=0)
				{
					swap(vect[i], vect[j]);
					break;
				}
			}
		}
	}
}


//* trying the N lineal
//* This is not N lineal
void zerosN(vector <int>& vect)
{
	for(int i = 0; i < vect.size(); ++i)
	{
		if(vect[i] == 0)
		{
			int temp = 0;
			vect.erase(vect.begin() + i);
			vect.push_back(temp);
		}
	
	}
}