#include <iostream>
#include <string>
using namespace std;

void permute (string str);
void permute_helper(string str, string choice);
int main()
{
	permute("RAT");
	return 0;
}

void permute(string core)
{
	permute_helper(core, "");
}

void permute_helper(string str, string choice)
{
	if(str.length() == 0)
	{	
		cout << choice << endl;
	}

	else
	{
		for(unsigned int i = 0; i < str.length(); i++)
		{
			char tmp = str[i];
			choice.push_back(tmp);
			str.erase(i, 1);
			permute_helper(str, choice);
			str.insert(i, 1, tmp);
			choice.pop_back();
		}
	}
}