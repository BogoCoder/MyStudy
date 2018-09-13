#include <iostream>
#include <queue>
#include <map>
#include <string>
#include <stdio.h>
#include <fstream>
using namespace std;

const char stop_ch = '\n';
const char inter_ch = '*';

void sleep(void);
void storemap(map<char, string>& dicI, map<string, char>& dicII);
void strtom(string input, map<char, string>& dic);
void mtostr(string input, map<string, char>& dic);
void printdics(map<char, string>& dictomorse , map<string, char>& dictostring);


ifstream inFile;
string key;
map<char, string> dictomorse;
map<string, char> dictostring;
std::map<char, string>::iterator itone;
std::map<string, char>::iterator ittwo;

int main(void) 
{
  string input;
  storemap(dictomorse, dictostring); // dictionaries

  printf("Morse code translator\n");
  getline(cin, input);

  if(isalpha(input[0]) || isdigit(input[0])) //identy string
  {
  	strtom(input, dictomorse);
  }

  else if (input[0] == '.' || input[0] == '-') //identify morse
  {
  	mtostr(input, dictostring);
  }

  else cout << "Oops!, wrong input." << endl; //

  return 0;
}

void sleep(void) //sleep funct to printing buffer
{
  for (int i = 0; i < 5e7; i++) {}
}

void storemap(map<char, string>& dicI, map<string, char>& dicII) // reads the txt file and save its contain
{
  inFile.open("morsedic.txt"); // opening the txt file
  string c;
  string val;
  char k;
  while (getline(inFile, c)) // reading each line
  {
    val = "";
    k = c[0]; //get alphabetic
    for(int i = 1 ; i < c.length(); ++i)
    {
      val += c[i]; //get morse
    }
    dicI.insert(std::pair<char, string>(k, val));
    dicII.insert(std::pair<string, char>(val, k));
  }
}

void strtom(string input, map<char, string>& dic) //convert str to morse
{
  string newinp = "";
  for(int i = 0; i <= input.length(); ++i)
  {
    if(!(isblank(input[i])) && (isalpha(input[i]) || isdigit(input[i])))
    {
      newinp += toupper(input[i]);
    }
  }

  for(int j = 0; j <= newinp.length(); ++j)
  {
    sleep();
    cout << dic[newinp[j]] << " " << flush;
  }

  cout << endl;
}

void mtostr(string input, map<string, char>& dic) //convert morse to str
{
  string newinp = "";
  for(int i = 0; i <= input.length(); ++i)
  {
    while(!(isblank(input[i])) && i < input.length())
    {
      newinp += input[i];
      ++i;
    }

    sleep();
    cout << dic[newinp] << flush ;
   	newinp = "";
   }
  cout << endl;
}

void printdics(map<char, string>& dictomorse , map<string, char>& dictostring) //print the maps
{
	std::cout << "mymap contains:\n";
  for (itone=dictomorse.begin(); itone!=dictomorse.end(); ++itone)
    std::cout << itone->first << " => " << itone->second << '\n';

  std::cout << "mymap contains:\n";
  for (ittwo=dictostring.begin(); ittwo!=dictostring.end(); ++ittwo)
    std::cout << ittwo->first << " => " << ittwo->second << '\n';
}