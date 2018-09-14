#include <iostream>
#include <string>
#include <stdio.h>
#include <algorithm>
using namespace std;

string investI(string word);
string investII(string word);
int main()
{
	string input;

	cout << "Enter a line to invest it: ";
	getline(cin, input);

	cout << "First algorithm: ";
	cout << investI(input) << endl; //first option

	cout << "Second algorithm: ";
	cout << investII(input) << endl; //second option
	return 0;
}

string investI(string word)
{
	string sub;
	string ln = word;
	int len = ln.length();

	if(len <= 1)
	{
		return ln;
	}

	else
	{
		swap(ln[len - 1], ln[0]);
		sub = investI(ln.substr(1, ln.length() - 2));
		ln.replace(1, ln.length() - 2, sub);
		return ln;
	}
}

string investII(string word)
{
	int end;
	int len = word.length();
	
	if(len <= 1)
	{
		return word;
	}

	else
	{
		end = len - 1;
		return  word[end] + investII(word.substr(0, end));
	}
}