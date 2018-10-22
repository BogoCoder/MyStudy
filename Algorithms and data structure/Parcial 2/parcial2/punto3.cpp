#include <iostream>
#include <cmath>
using namespace std;

void to_binary(const int * const n) 
{
	int tmp = (*n);
	if(tmp < 0)
	{	
		tmp = abs(tmp);
		cout << "-";
	}

    if(tmp/2 == 1)
	{	
		cout << (*n)/2 << (*n)%2;
	}

	else
	{
		
		int cn = tmp/2;
		//cout << "\ncn " << cn << endl;
		int * cnp = &cn;
		to_binary(cnp);
		cout << tmp%2;
	}
}

int main() {
	int x = -20;
	int* ptrx = &x;
	to_binary(ptrx);
	cout << endl;
    for (int i = -9; i < 10; ++i)
    {
    	/*int x = i;
    	int* ptrx = &x;
        to_binary(ptrx);
		cout << endl;*/
    }
    	

    return 0;
}

