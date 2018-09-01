#include <iostream>
#include <string>
#include "ex.hpp"
using namespace std;

int main()
{
	string ln;

	cout << "// Vocals //" << endl;
	cout << "Enter a line: ";
	getline(cin, ln);
	vocals(ln);

	cout << "// Digits //" << endl;
	cout << "Enter a line: ";
	getline(cin, ln);
	digits(ln);

	cout << "// Lower //" << endl;
	cout << "Enter a line: ";
	getline(cin, ln);
	cout << lower(ln) << endl;

	cout << "// Lower by ref //" << endl;
	cout << "Enter a line: ";
	getline(cin, ln);
	loweref(ln);
	cout << ln << endl;

  cout << "// Quit spaces //" << endl;
	cout << "Enter a line: ";
	getline(cin, ln);
	quitspaces(ln);
	cout << ln << endl;

  cout << "// Acrony //" << endl;
	cout << "Enter a line: ";
	getline(cin, ln);
	cout << acro(ln) << endl;

	return 0;
}
