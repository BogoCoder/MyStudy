#include <iostream>
#include <string>
#include "dom.hpp"

int main()
{
	Domino c(0, 2);
	Domino b(0, 3);
	cout << c << b << endl;

	if(c > b)
	{
		cout << "true" << endl;
	}

	else cout<< "false" << endl;
	return 0;
}