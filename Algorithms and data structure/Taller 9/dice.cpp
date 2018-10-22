#include <iostream>
#include <string>
using namespace std;

void dice_rolls(int dice);
void dice_rolls_helper(int core, string prefix);

int main()
{
	dice_rolls(1);
	return 0;
}

void dice_rolls(int dice)
{
	dice_rolls_helper(dice, "");
}

void dice_rolls_helper(int core, string chosen)
{
	if(core == 0)
	{
		cout << "{" << chosen << "}" << endl;
	}

	else
	{
		if(chosen.length() > 0)
		{
			chosen += ", ";
		}
		for(int i = 1; i <= 6;  ++i)
		{	
			chosen += to_string(i);
			dice_rolls_helper(core - 1, chosen);
			chosen.pop_back();
		}
		
	}
}
