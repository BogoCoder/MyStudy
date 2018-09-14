#include <iostream>
#include <string>
using namespace std;

bool isPalindrome(string word);
int main()
{
	string input;

	cout << "Enter a line: ";
	getline(cin, input);
	bool ans = isPalindrome(input);

	if(ans == true)
	{
		cout << "The word is palindrome!"<< endl;
	}

	else
	{
		cout << "Nope!, that word is not palidrome."<< endl;
	}
	

	return 0;
}

bool isPalindrome(string word)
{
	string ln;
	for(int i = 0; i < word.length(); ++i)
	{
		ln += tolower(word[i]);
	}

	int len = ln.length();
	if(len <= 1)
	{
		return true;
	}

	else
	{
		return ln[0] == ln[len - 1] && isPalindrome(ln.substr(1, len - 2));
	}
}