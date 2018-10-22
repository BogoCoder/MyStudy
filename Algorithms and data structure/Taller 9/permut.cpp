#include <iostream>
#include <string>
#include <set>
using namespace std;

set<string> genPermutations(string& str);
set<string> putCharInGrooves(set<string> tmp, char ch);
int main()
{
	string input;

	cout << "Enter a line: ";
	getline(cin, input);
	set<string> mylist = genPermutations(input);

	cout << "\nPrinting list of permuts: " << endl << endl;

	for(auto it = mylist.begin(); it != mylist.end(); ++it)
	{
		cout << *it << endl;
	}


	return 0;
}

set<string> genPermutations(string& str)
{
	set<string> final;
	if(str.size() == 0)
	{
		final.insert("");
		return final;
	}
	else
	{
		char first = str[str.size() - 1];
		string tmp = str.substr(0, str.size() - 1);
		set<string> s_tmp = genPermutations(tmp);
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