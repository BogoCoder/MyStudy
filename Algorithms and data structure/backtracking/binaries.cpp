#include <iostream>
#include <string>
using namespace std;

void print_binary_helper(int digits, string prefix);
void print_binary(int digits);
void indenter(int n);

int main()
{
	int bin = 10;
	cout << "print_binary(" << bin << ")" << endl;
	print_binary(bin);
	return 0;
}

void indenter(int n)
{
	for(int i = 0; i < n; ++i)
	{
		cout << "    ";
	}
}

void print_binary_helper(int digits, string prefix)
{
	indenter(prefix.size());
	cout << "print_binary(" << digits << "," << prefix << ")" << endl;

	if(digits == 0)
	{
		indenter(prefix.size() + 1);
		cout << prefix << endl;
	}

	else
	{
		for(int o = 0; o < 2; ++o)
		{
			print_binary_helper(digits - 1, prefix + "0");
			print_binary_helper(digits - 1, prefix + "1");
		}
	}
}

void print_binary(int digits)
{
	print_binary_helper(digits, "");
}