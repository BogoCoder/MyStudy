#include <iostream>
#include <queue>
#include <stdio.h>
using namespace std;

void blade(queue<int>& people, int m);

int main()
{
	int n, m;
	queue<int> people;

	printf("Enter the quantity of people : "); cin >> n;

	for(int i = 1; i <= n; i++) 
		{
			people.push(i);
		}

	printf("Enter the number of people between half : ");  cin >> m;

	printf("One person will be killed every %d people \n", m);

	blade(people, m);


return 0;
}

void blade(queue<int>& people, int m)
{
	int temp;
	while(people.size() > 1)
	{
		for(int i = 0; i <= m; i++)
		{
			temp = people.front();
			people.pop();
			people.push(temp);
		}
		printf("The person number %d just died. \n" ,  people.front());
		people.pop();
	}
	printf("THE PERSON %d SURVIVES! \n" , people.front() );
}