#include <iostream>
using namespace std;

int main()
{
	int ival = 1024; //initialize variable
	int &ref; //this generates an error because we can't reference a value that hasn't been initialized
	int &rval = ival; //this is ok
	int *pval1 = rval; // invalid conversion int to int*, we can't point to a int, we point to a int reference
	int *pval2 = &rval; //this is ok
	int *pval3 = ival; // invalid conversion int to int*, we can't point to a int, we point to a int reference
	int *pval4 = &ival; //this is ok
	int *p1, p2; //this is ok,but we have to use them
	return 0;
}