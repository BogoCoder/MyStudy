#include <iostream>
#include "queue.hpp"
using namespace std;

int main()
{
	Queue<int> myQueue;

	cout << "\n" << "/////////////" << endl << endl;
	myQueue.push(10);
	myQueue.push(50);
	myQueue.push(30);

	while(!myQueue.empty())
		{
			cout << myQueue.pop() << endl;
		}

	for(int i = 0; i <= 50; ++i) 
		{
			myQueue.push(i);
		}

	cout << "\n" << "/////////////" << endl << endl;

	while(!myQueue.empty())
		{
			cout << myQueue.pop() << endl;
		}



	return 0;
}