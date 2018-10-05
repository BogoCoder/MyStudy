#include <iostream>
using namespace std;

char * deep_copy(char *ch);
int main()
{
	char lol = '1';
	char * ch = &lol;

	//use the instruction that u wanna analize

	//char * deep_copy(char *ch); //returns a pointer to a char
	//cout << *(deep_copy(ch))<< endl; 

 
	char * (*deep_ptr)(char *ch); //initialize a pointer to a function which returns char* and has (char*) as argument
	deep_ptr = &deep_copy; //this assigns the reference of the function deep_copy to the pointer

	cout << *deep_ptr(ch) << endl; 

	return 0;
}

char * deep_copy(char *ch)
{
	return ch;
}

