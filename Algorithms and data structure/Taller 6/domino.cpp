#include <iostream>
#include <set>
#include "dom.hpp"

int main()
{
	set<Domino>::iterator iter;
	set<Domino> Dominoes;

	for(int i = 0; i <= 6; i++)
	{
		for(int j = 0; j <= 6; j++)
		{
			Dominoes.insert(Domino(i, j));
		}
	}

	for(iter=Dominoes.begin(); iter!=Dominoes.end(); iter++)
	{
		Domino tmp = *iter;
    	cout << "[" << tmp.getA() << "|" << tmp.getB() << "]" << " " << endl;
	}

	cout << endl << "num of tales : " << Dominoes.size()<< endl;

	//You can try to use the overloaded operators

	return 0;
}