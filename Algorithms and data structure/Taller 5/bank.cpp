#include <iostream>
#include <set>
#include <stdio.h>
#include <string>
using namespace std;

int main()
{
	string input;
	set<string> dbase = {"Juan", "Camilo", "Nicolas", "Juli"};

	cout << "Enter your first name: ";
	getline(cin, input);

	//const bool is_in = container.find(element) != container.end();

	if(dbase.count(input))
		{
		cout << "The check is yours!" << endl; 
		}

	else
		{
		cout << "Bad luck! ur mom gay." << endl;
		}

	return 0;
}