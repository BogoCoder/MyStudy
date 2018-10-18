#ifndef _stack_h_
#define _stack_h_
using namespace std;

#include <iostream>

template <typename dataType>
class Stack
{
private:

	struct Cell {

		dataType data;
		Cell *link;
	};

	Cell *stack;
	int count;

	void deepCopy(const Stack<dataType> & src);

	Stack(const Stack & value) { }
	const Stack & operator=(const Stack & rhs)
	{
		return *this;
	}

public:
	Stack();
	~Stack ();
	size_t size();
	bool empty();
	void clear();
	void push(dataType elem);
	dataType pop();
	dataType top();
};

#include "stack.cpp"

#endif