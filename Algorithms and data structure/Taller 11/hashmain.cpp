#include <iostream>
#include "hash_map.hpp"
using namespace std;

int main() {

	hash_map<int, char> myletters;

	myletters.insert(1, 'a');

	myletters.display();

	cout << endl;

	myletters.insert(2, 'b');
	myletters.insert(3, 'c');
	myletters.insert(4, 'd');
	myletters.insert(5, 'e');

	myletters.display();

	cout << endl;

	if(myletters.find(3)) cout << "The element with key = 3 is in the map." << endl;

	if(!myletters.insert(3, 'c')) cout << "insert: an element with key = 3 is already in the map!" << endl;

	if(!myletters.remove(0)) cout << "remove: there is no element with key = 0!" << endl;

	cout << endl;

	myletters.remove(1);

	myletters.display();

	if(!myletters.find(1)) cout << "The element with key = 1 is no longer in the map." << endl;

	cout << endl;

	myletters.clear();
	cout << "the map has been cleared." << endl;

	myletters.display();
	
	if(!myletters.find(2)) cout << "The element with key = 2 is no longer in the map." << endl;

	
	return 0;
}