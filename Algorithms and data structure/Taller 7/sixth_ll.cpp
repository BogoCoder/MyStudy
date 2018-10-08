#include <iostream>
using namespace std;

int const DIM = 20;

struct Cell 
{
	int content;
	Cell *link;
};

Cell* createIndexArray(int k);
void destroy(Cell *p);

int main()
{
	Cell* pt = createIndexArray(DIM);

	for(int i= 0; i < DIM; ++i) 
		{
			cout << pt->content << endl;
			pt = pt->link;
		}

	return 0;
}

Cell* createIndexArray(const int k)
{
	Cell *ref = nullptr;
	Cell *first = nullptr;

	for(int i = 0; i < k;  ++i)
	{

		Cell *root = new Cell;
		root->content = i;
		root->link = nullptr;

		if(i == 0)
		{
			first = root;
		}

		if(i > 0)
		{
			ref->link = root;
		}

		ref = root;
	}

	return first;
}

void destroy(Cell * p)
{
	delete p;
}