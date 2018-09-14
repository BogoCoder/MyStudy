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
	genPermutations(input);


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
		cout << first << endl;
		string tmp = str.substr(0, str.size() - 1);
		cout << tmp << endl;
		set<string> s_tmp = genPermutations(tmp);
		final = putCharInGrooves(s_tmp, first);
		return final;
	}
}

set<string> putCharInGrooves(set<string> tmp, char ch)
{
	set<string> toret;
	set<string>::iterator it;
	string temp = "";

	temp += ch;

	cout << "{";
	for (it=tmp.begin(); it!=tmp.end(); ++it)
		{
			tmp.insert(temp);
			cout << *it << " ";
		}

	cout << "}" << endl;
	return tmp;
}