#include "dom.hpp"
#include <iostream>

ostream & operator<<(ostream & os, Domino toc)
{
	return os << to_string(toc);
}

bool operator==(Domino p, Domino q)
{
	return (p.endA == q.endA) && (p.endB == q.endB);
}

bool operator!=(Domino p, Domino q)
{
	return (p.endA != q.endA) || (p.endB != q.endB);
}

bool operator<(Domino p, Domino q)
{
	if(p.endA < q.endA) return true;
	else if(p.endA == q.endA)
	{
		return p.endB < q.endB;
	}
	else
	{
		return false;
	}
}

bool operator<=(Domino p, Domino q)
{
	return (p < q) || (p == q);
}

bool operator>(Domino p, Domino q)
{
	if(p.endA > q.endA) return true;
	else if(p.endA == q.endA)
	{
		return p.endB > q.endB;
	}
	else
	{
		return false;
	}
}

bool operator>=(Domino p, Domino q)
{
	return (p > q) || (p == q);
}

Domino::Domino()
{
	endA = 0;
	endB = 0;
}

Domino::Domino(int ac)
{
	endA = ac;
	endB = 0;
}

Domino::Domino(int ac, int ay)
{
	endA = ac;
	endB = ay;
}

string to_string(Domino p)
{
	string A;
	string B;

	switch(p.endA)
	{
		case 0:
		A = "\n+-------+\n|       |\n|       |\n|       |\n+-------+";
		break;

		case 1:
		A = "+-------+\n|       |\n|   #   |\n|       |\n+-------+";
		break;

		case 2:
		A = "+-------+\n|#      |\n|       |\n|      #|\n+-------+";
		break;

		case 3:
		A = "+-------+\n|#      |\n|   #   |\n|      #|\n+-------+";
		break;

		case 4:
		A = "+-------+\n|#     #|\n|       |\n|#     #|\n+-------+";
		break;

		case 5:
		A = "+-------+\n|#     #|\n|   #   |\n|#     #|\n+-------+";
		break;

		case 6:
		A = "+-------+\n|#     #|\n|#     #|\n|#     #|\n+-------+";
		break;
	}

	switch(p.endB)
	{
		case 0:
		B = "\n|       |\n|       |\n|       |\n+-------+";
		break;

		case 1:
		B = "\n|       |\n|   #   |\n|       |\n+-------+";
		break;

		case 2:
		B = "\n|#      |\n|       |\n|      #|\n+-------+";
		break;

		case 3:
		B = "\n|#      |\n|   #   |\n|      #|\n+-------+";
		break;

		case 4:
		B = "\n|#     #|\n|       |\n|#     #|\n+-------+";
		break;

		case 5:
		B =  "\n|#     #|\n|   #   |\n|#     #|\n+-------+";
		break;

		case 6:
		B = "\n|#     #|\n|#     #|\n|#     #|\n+-------+";
		break;
	}


	return A + B;	
}