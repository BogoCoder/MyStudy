#include <iostream>
#include <string>
#include <stdio.h>
#include <math.h>
#include <map>
using namespace std;

void sieve(int input, map<int, bool>& list);
void printprimes(map<int, bool> list);
void printnonprimes(map<int, bool> list);

int main()
{
	map<int, bool> list;
	int input;

	cout << "Enter a natural number: ";
	cin >> input;
	sieve(input, list);
	

	cout << "Prime numbers less than or equal to " << input << ":" << endl;
	printprimes(list);
	cout << "Non-Prime numbers less than or equal to " << input << ":" << endl;
	printnonprimes(list);

  		

}

void sieve(int input, map<int, bool>& list)
{
	map<int, bool>::iterator it;
	for(int i = 2; i <= input; ++i)
	{
		list.insert(std::pair<int, bool>(i, true));
	}

	for(int j = 2; j <= sqrt(input); ++j)
		{
			if(list[j] == true)
			{
				for(int k = pow(j, 2); k <= input; k+=j)
				{
					list[k] = false;
				}
			}
		}
}

void printprimes(map<int, bool> list)
{
	map<int, bool>::iterator it;
	for (it=list.begin(); it!=list.end(); ++it)
		if(it->second == true)
		{
			std::cout << it->first <<endl;
		}
}

void printnonprimes(map<int, bool> list)
{
	map<int, bool>::iterator it;
	cout << 1 << endl;
	for (it=list.begin(); it!=list.end(); ++it)
		if(it->second == false)
		{
			std::cout << it->first <<endl;
		}
}
