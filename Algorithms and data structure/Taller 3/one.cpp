#include <iostream>
#include <string>
#include <stdlib.h>
#include <stdio.h>
#include <time.h>
#include <math.h>
#include "basord.hpp"
using namespace std;

int main()
{
	clock_t t;
	int myints[100000];
	for (int a = 0; a < 100000; ++a) 
	{
    myints[a] = rand();
	}

	t = clock();
	BubbleSort(myints, 100000);
	t = clock() - t;
	printf ("It took me %d clicks (%f seconds).\n",(int)t,((float)t)/CLOCKS_PER_SEC);

	//*for(int a = 0; a < 100000; a++)
	//*{
		//*cout << myints[a] << endl;
	//*}
	
return 0;
}

