#ifndef _stack_c_
#define _stack_c_
#include <iostream>
#include "stack.hpp"

template<typename dataType>
Stack<dataType>:: Stack()
{
	stack = nullptr;
	count = 0;
}

template<typename dataType>
Stack<dataType>::~Stack()
{
	clear();
}

template<typename dataType>
size_t Stack<dataType>::size()
{
	return count;
}

template<typename dataType>
bool Stack<dataType>::empty()
{
	return count == 0;
}

template<typename dataType>
void Stack<dataType>::clear()
{
	while(count > 0)
	{
		pop();
	}
}

template<typename dataType>
void Stack<dataType>::push(dataType elem)
{
	Cell *cell = new Cell;
	cell->data = elem;
	cell->link = stack;

	stack = cell;

	count++;
}

template<typename dataType>
dataType Stack<dataType>::pop()
{
	if(empty()) throw invalid_argument("pop: Attempting to pop an empty stack");

	Cell *cell = stack;
	dataType result = cell->data;
	stack = stack->link;

	count--;
	delete cell;

	return result;
}

template<typename dataType>
dataType Stack<dataType>::top()
{
	if(empty()) throw invalid_argument("Function top() not available for empty stack") ;

	return stack->data;
}

#endif