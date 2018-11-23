#ifndef _fast_sort_hpp_
#define _fast_sort_hpp_

#include <iostream>
#include <vector>
#include "heap.hpp"

template<typename T>
void heapsort(std::vector<T> & items);

template<typename T>
void percDown(std::vector<T> & A, int i, int n);

template<typename T>
void mergesort(std::vector<T> & items);

template<typename T>
void mergesort(std::vector<T> & items, std::vector<T> & tmp, int left, int right);

template<typename T>
void merge(std::vector<T> & items, std::vector<T> & tmp, int leftPos, int rightPos, int rightEnd);

#include "fast_sort.cpp"

#endif /* _fast_sort_hpp_ */