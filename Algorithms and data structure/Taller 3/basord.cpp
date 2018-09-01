#include <iostream>
#include <string>
#include <stdlib.h>
#include <stdio.h>
#include <time.h>
#include <math.h>
#include "basord.hpp"
using namespace std;

bool IsSorted(int* data,int count)
{
	while (--count >= 1)
		if (data[count] < data[count - 1]) return false;

	return true;
}

void Shuffle(int* data, int count)
{
	int temp, rnd;

	for (int i = 0; i < count; ++i)
	{
		rnd = rand() % count;
		temp = data[i];
		data[i] = data[rnd];
		data[rnd] = temp;
	}
}

void BogoSort(int* data, int count)
{
	while (!IsSorted(data, count))
		Shuffle(data, count);
}

void swap(int* one, int* two)
{
	int* temp = one;
	one = two;
	two = temp;
}

void SelectionSort(int* data, int count)
{
	for(int i = 0; i < count; ++i)
	{
		int minIndex = i;
		for(int j = i+1; j < count; ++j)
		{
			if (data[j] < data[minIndex])
			{
				minIndex = j;
			}
		}
	swap(data[i], data[minIndex]);
	}
}

void BubbleSort(int* data, int count)
{
	for(int i = 0; i < count - 1; ++i)
	{
		for(int j = 0; j < count - 1; ++j)
		{
			if(data[j] > data[j+1])
			{
				swap(data[j], data[j+1]);
			}
		}
	}
}

void BubbleSortB(int* data, int count)
{
	bool swapped = true;
	while(swapped)
	{
		for(int j = 0; j < count - 1; ++j)
		{
			if(data[j] > data[j+1])
			{
				swap(data[j], data[j+1]);
				swapped = false;
			}
		}
	}
}

void InsertionSort(int* data, int count)
{
	for(int i = 1; i < count; ++i)
	{
		int b = data[i];
		int j = i - 1;

		while (j > 0 && data[j] > b)
		{
			data[j+1] = data[j];
			j = j-1;
		}
	data[j+1] = b;
	}
}