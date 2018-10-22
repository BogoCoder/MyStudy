#include <iostream>
#include <string>
#include <set>
#include <vector>
using namespace std;


//sin terminar
set<string> genStrings(set<char> chars, int k);
set<string> putCharInGrooves(set<string> tmp, char ch);
int main()
{
	int input;
	set<char> chars = {'a', 'b'};
	auto iter = prev(chars.end());

	cout << *iter << endl;

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
	set<char> chartemp = chars;
	settovec(chars, k);
	auto it = chartemp.begin();
	if(!chartemp.empty()) it = prev(chartemp.end());

	cout << "ptr: " << *it  << endl;

	set<string> final;
	if(chartemp.size() == 0)
	{
		cout << "end" << endl;
		final.insert("");
		return final;
	}
	else
	{
		cout << "good!" << endl;
		char first = *it;
		chartemp.erase(it);
		set<string> s_tmp = genStrings(chartemp, k-1);
		final = putCharInGrooves(s_tmp, first);
		return final;
	}
}

set<string> putCharInGrooves(set<string> tmp, char ch)
{
	set<string> toret;

	string tmchar = "";
	tmchar += ch;
	string str;
	string temp;

	for (auto it=tmp.begin(); it!=tmp.end(); ++it)
		{
			str = *it;
			for(unsigned int i = 0; i <= str.size(); ++i)
			{
				temp = str;

				temp.insert(i, tmchar);
				toret.insert(temp);
			}

		}
	return toret;
}