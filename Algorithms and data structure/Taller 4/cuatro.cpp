#include <iostream>
#include <string>
#include <stack>
#include <stdio.h>
#include <algorithm>
using namespace std;
void includer(string input, stack<char>&  st);
bool isOpen(char sym);
bool isClosed(char sym);
bool isRight(char sym1, char sym2);
bool Analyzer(stack<char>& st, int index);
int main()
{
	stack<char> st;
	string input;

	printf("Enter the chain of symbols: ");
	getline(cin, input);
	includer(input, st);

	return 0;
	

}

void includer(string input, stack<char>&  st)
{
	bool veridict;
	bool r;
	if(input.length() > 1)
	{
		for(int i = 0; i < input.length(); ++i)
		{
			if(!(isOpen(input[i]) || isClosed(input[i])))
			{
				r = false;
				break;
			}

			st.push(input[i]);

			if(Analyzer(st, i) == false || isOpen(input[input.length() - 1]))
			{
				veridict = false;
				break;
			}
			else
			{
				veridict = true;
			}
		}

		if (r == true)
		{
			if(veridict)
			{
				printf("YEY!, that's balanced!\n");
			}
			else
			{
				printf("WRONG!, that's NOT balanced!\n");
			}
		}

		else
		{
			printf("That input is not right!\n");
		}
		
	}
	else
	{
		printf("Hmmm, that's not right at all.\n");
	}
	
}


bool isOpen(char sym)
{
	if(sym == '(' || sym == '{' || sym == '[')
	{
		return true;
	}

	else return false;
}

bool isClosed(char sym)
{
	if(sym == ')' || sym == '}' || sym == ']')
	{
		return true;
	}

	else return false;
}

bool isRight(char sym1, char sym2)
{
	if(sym1 == '(' && sym2 == ')')
	{
		return true;
	}
	if(sym1 == '[' && sym2 == ']')
	{
		return true;
	}
	if(sym1 == '{' && sym2 == '}')
	{
		return true;
	}

	else return false;
}

bool Analyzer(stack<char>& st, int index)
{
	char temp;

	if(index >= 0 && isOpen(st.top())) return true;

	else if(index > 0 && isClosed(st.top()))
	{
		temp = st.top();
		st.pop();
		if(!isRight(st.top(), temp))
		{
			return false;
		}
		else
		{
			st.pop();
			return true;
		}
	}

	else return false;
}