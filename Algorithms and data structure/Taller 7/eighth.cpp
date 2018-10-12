#include <iostream>
#include <vector>
using namespace std;

vector<int> takeodds(vector <int> vec);

int main()
{
	std::vector<int> vi = {0,1,2,3,4,5,6,7,8,9};

	vector<int> odds = takeodds(vi);

	for(auto ito = odds.begin(); ito != odds.end(); ++ito)
	{
		cout << *ito<< endl;
	}

	return 0;
}

vector<int> takeodds(vector <int> vec)
{
	vector<int> odds;
	for(auto it = vec.begin(); it != vec.end(); ++it)
	{
		if(*it % 2 != 0)
		{
			odds.push_back(*it);
		}
	}

	return odds;
}