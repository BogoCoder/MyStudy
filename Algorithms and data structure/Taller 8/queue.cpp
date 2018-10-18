#ifndef _queue_c_
#define _queue_c_
#include <iostream>
#include "queue.hpp"

template<typename dataType>
Queue<dataType>:: Queue()
{
	capacity = INITIAL_CAPACITY;
	array = new dataType[capacity];
	head = 0;
	tail = 0;
}

template<typename dataType>
int Queue<dataType>::size()
{
	return (tail + capacity - head) % capacity;
}

template<typename dataType>
bool Queue<dataType>::empty()
{
	return head == tail;
}

template<typename dataType>
void Queue<dataType>::clear()
{
	head = tail = 0;
}

template<typename dataType>
void Queue<dataType>::push(dataType elem)
{
	if(size() == capacity - 1) expandCapacity();
	
	array[tail] = elem;
	tail = (tail + 1) % capacity;
}

template<typename dataType>
dataType Queue<dataType>::pop()
{
	if(empty()) throw invalid_argument("pop: Attempting to pop an empty queue");

	dataType result = array[head];
	head = (head + 1) % capacity;

	return result;
}

template<typename dataType>
dataType Queue<dataType>::top()
{
	if(empty()) throw invalid_argument("Function top() not available for empty Queue") ;

	return array[head];
}

#endif