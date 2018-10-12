#ifndef _stack_c_
#define _stack_c_
#include <iostream>
#include "s.hpp"

template<typename dataType>
Stack<dataType>:: Stack()
{
	stack = nullptr;
	count = 0;
}

template<typename dataType>
Stack<dataType>::~Stack()
{
	//something
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
		//something
	}
}

template<typename dataType>
dataType Stack<dataType>::top()
{
	if(empty()) throw invalid_argument("Function top() not available for empty stack") ;

	return stack->data;
}

template<typename dataType>
dataType Stack<dataType>::top()
{
	if(empty()) throw invalid_argument("Function top() not available for empty stack") ;

	return stack->data;
}

#endif