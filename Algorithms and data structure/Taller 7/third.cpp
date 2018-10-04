#include <iostream>
using namespace std;

char * deep_copy(char *ch);
int main()
{
	char lol = '1';
	char * ch = &lol;

	//char * deep_copy(char *ch); //returns a pointer to a char
	cout << *(deep_copy(ch))<< endl; 

 
	char (*deep_copy)(char *ch) = deep_copy;
	return 0;
}

char * deep_copy(char *ch)
{
	return ch;
}