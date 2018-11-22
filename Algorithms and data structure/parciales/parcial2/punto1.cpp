#include <iostream>
#include <map>
#include <string>
#include <fstream>
using namespace std;

void storemap(map<string, string>& dic);
void printdics(map<string, string>& dic);


ifstream inFile;
string key;

int main(void) 
{
	map<string, string> dic;
  storemap(dic); // dictionaries
  printdics(dic);

  return 0;
}

void storemap(map<string, string>& dic) // reads the txt file and save its contain
{
  inFile.open("aed_parcial2_p1.txt"); // opening the txt file
  string k = "";
  string val = "";
  char tmp;
  int count = 0;
  string n = "";
  char tab = '	';
  getline(inFile, n);
  while (inFile.get(tmp)) // reading each line
  {
  	if(tmp == tab && count < 2)
  	{
  		++count;
  		while(inFile.get(tmp))
  		{
  			if(!(tmp == tab))
  			{
  				break;
  			}
  		}
  	}
  	else if(count >= 2)
  	{	
  		if(isalpha(k[0])) k.erase(0, 1);
  		dic.insert(std::pair<string, string>(k, val));
  		k = "";
  		val = "";
  		getline(inFile, n);
  		count = 0;
  	}

  	if(count == 0) k += tmp;
    if(count == 1) val += tmp;

    //cout << "key: " << k << "	" << "con: " << val << endl;  
  }

  /*for (auto itone=dic.begin(); itone!=dic.end(); ++itone)
   	std::cout << itone->first << " => " << itone->second << '\n';*/

}

void printdics(map<string, string>& dic) //prints the maps
{
	std::cout << "Exit Code\t" << "Meaning" << endl;
  	for (auto itone=dic.begin(); itone!=dic.end(); ++itone)
   	std::cout << itone->first << " \t" << itone->second << '\n';

}