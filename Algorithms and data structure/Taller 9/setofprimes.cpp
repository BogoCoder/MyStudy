#include <iostream>
#include <string>
#include <stdio.h>
#include <math.h>
#include <map>
#include <set>
using namespace std;

void sieve(int input, map<int, bool>& list);
void insertprimes(map<int, bool> list, set<int>& primes);
std::set<int> createPrimeSet(int max);
void printset(set<int> primes);

int main()
{
	int input;

	cout << "Enter a natural number: ";
	cin >> input;
	set<int> p = createPrimeSet(input); //variable to the set returned by createPrimeSet funct

	cout << "This is the set of primes between 2 and " << input << ": " << endl;
	printset(p); //printing set

	return 0;
}

std::set<int> createPrimeSet(int max) //creating the primeset with pre-defined functions
{
	map<int, bool> list;
	set<int> primes;
	sieve(max, list);
	insertprimes(list, primes);
	return primes;
}

void sieve(int input, map<int, bool>& list) //sieve with map
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

void insertprimes(map<int, bool> list, set<int>& primes) //insert primes to a set
{
	map<int, bool>::iterator it;
	for (it=list.begin(); it!=list.end(); ++it)
		if(it->second == true)
		{
			primes.insert(it->first);
		}
}

void printset(set<int> p) //printing the set of primes
{
	set<int>::iterator it;

	cout << "{ ";
	for (it=p.begin(); it!=p.end(); ++it)
		{
			cout << *it << " ";
		}

	cout << "}" << endl;
}