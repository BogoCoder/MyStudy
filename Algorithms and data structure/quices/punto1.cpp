#include <iostream>
#include <string>
using namespace std;

void print_num(int n);
int main()
{
	int input;

	cout << "Enter an int: ";
	cin >> input;
	print_num(input);
	return 0;
}

void print_num(int n)
{
	string temp = to_string(n);	
	int len = temp.length();
	if (len == 1)
	{
		cout << temp << endl;
	}

	else
	{
		cout << temp[0];
		int tp = stoi(temp.substr(1, len-1));
		print_num(tp);
	}
}