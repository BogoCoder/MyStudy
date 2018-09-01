#include<iostream>
#include <string>
#include <cctype>
#include "ex.hpp"
// using namespace std;

void vocals(string ln)
{
	int counint = 0;

	for(int i = 0; i < ln.length(); i++)
	{
		if(ln[i] == 'a' || ln[i] == 'e' || ln[i] == 'i' || ln[i] == 'o' || ln[i] == 'u'
		|| ln[i] == 'A' || ln[i] == 'E' || ln[i] == 'I' || ln[i] == 'O' || ln[i] == 'U')
	{
		++counint;
	}
	}

	cout << counint << endl;
}

void digits(string ln)
{
	int counint = 0;

	for(int i = 0; i < ln.length(); i++)
	{
		++counint;
	}

	cout << counint << endl;
}

string lower(string ln)
{
	string newln;

	for(int i = 0; i < ln.length(); i++)
	{
		newln += tolower(ln[i]);
	}
	return newln;
}

void loweref(string& ln)
{
	for(int i = 0; i < ln.length(); i++)
	{
		ln[i] = tolower(ln[i]);
	}
}

void quitspaces(string& ln)
{
  string templn;
  for(int i = 0; i < ln.length(); i++)
  {
    if(!isspace(ln[i]))
    {
        templn += ln[i];
    }
  }
  ln = templn;
}

string acro(string ln)
{
  string templn;
  for(int i = 0; i < ln.length(); i++)
  {
    if(isspace(ln[i]))
    {
      if(isupper(ln[i + 1]))
      {
          templn += ln[i+1];
      }
    }
    else if(i == 0 && isupper(ln[i]))
    {
      templn += ln[i];
    }
  }
  return templn;
}
