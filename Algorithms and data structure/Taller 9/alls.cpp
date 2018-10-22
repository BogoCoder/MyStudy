#include <iostream>
#include <string>
#include <set>
#include <vector>
using namespace std;


//sin terminar
set<string> genStrings(set<char> chars, int k);
set<string> genStrings_helper(set<char> chars, int k, string choose);
int main()
{
	int input;
	set<char> chars = {'a', 'b'};

	cout << "Enter a int: ";
	cin >> input;
	set<string> mylist = genStrings(chars, input);

	cout << "\nPrinting list of permuts: " << endl << endl;

	for(auto it = mylist.begin(); it != mylist.end(); ++it)
	{
		cout << *it << endl;
	}


	return 0;
}

set<string> genStrings(set<char> chars, int k)
{
	return genStrings_helper(chars, k , ""); 
}

set<string> genStrings_helper(set<char> chars, int k, string choose)
{
	set<string> ret;
	set<string> chartemp;

	if(k == 1)
	{
		for (auto iter = chars.begin(); iter != chars.end(); ++iter) 
		{
			string temp = choose;
			temp.push_back(*iter);
			ret.insert(temp);
		}
	}
	else if(k > 1)
	{
		for (auto iter = chars.begin(); iter != chars.end(); ++iter) 
		{
			string temp = choose;
			temp.push_back(*iter);
			chartemp = genStrings_helper(chars,k-1, temp);
			for (auto i = chartemp.begin(); i != chartemp.end(); ++i) 
			{
				ret.insert(*i);
			}
		}
	}
	return ret;
}