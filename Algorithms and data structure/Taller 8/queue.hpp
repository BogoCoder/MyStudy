#ifndef _queue_h_
#define _queue_h_
using namespace std;

#include <iostream>

template <typename dataType>
class Queue
{
private:

	static const int INITIAL_CAPACITY = 10;

	dataType *array;
	int capacity, head, tail;

	void expandCapacity()
	{
		int count = size();
		dataType *oldarr = array;
		capacity *= 2;
		array = new dataType[capacity];

		for(int o = 0; o < count; o++)
		{
			array[o] = oldarr[(head + o) % (capacity/2)];
		}

		head = 0;
		tail = count;

		delete[] oldarr;
	}
	void deepCopy(const Queue<dataType> & src);

public:
	Queue();
	~Queue() { delete[] array; }
	int size();
	bool empty();
	void clear();
	void push(dataType elem);
	dataType pop();
	dataType top();
};

#include "queue.cpp"

#endif