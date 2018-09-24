#include <iostream>
#include <string>
using namespace std;

void permute (string str);
int main()
{
	permute("RAT");
	return 0;
}

void permute(string str)
{
	if(str.length() == 0)
	{	
		cout << "Nothing" << endl;
	}

	else
	{
		for(int i = 0; i <= str.length(); i++)
		{
			char tmp = str[i];
			permute(str.substr(1, str.length()))

		}


	}
}