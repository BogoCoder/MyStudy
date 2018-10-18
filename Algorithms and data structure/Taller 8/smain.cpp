#include <iostream>
#include "stack.hpp"
using namespace std;

int main()
{
	Stack<int> myStack;

	cout << "\n" << "/////////////" << endl << endl;
	myStack.push(10);
	myStack.push(50);
	myStack.push(30);

	while(!myStack.empty())
	{
		cout << myStack.pop() << endl;
	}

	cout << "\n" << "/////////////" << endl << endl;

	for(int i = 0; i < 50; ++i) 
		{
			myStack.push(i);
		}

	while(!myStack.empty())
		{
		cout << myStack.pop() << endl;
		}
	
	return 0;
}