#ifndef _hashmap_hpp_
#define _hashmap_hpp_
using namespace std;

#include <iostream>
#include <list>

const std::size_t PRIME_INITIAL_DIMENSION = 5;

template<typename dataType> 
class hashf {
public:
	std::size_t operator()(const dataType & key);
};

template<typename keyType, typename valueType>
class hash_map {
private:

	struct pair {
		keyType key;
		valueType val;
	};

	std::size_t count;
	std::size_t nBuckets;
	std::list<pair> *table;

	std::size_t hashing(const keyType & key);

public:

	hash_map();
	~hash_map();
	bool find(const keyType & key);
	bool insert(const keyType & key, const valueType & data);
	bool remove(const keyType & key);

	void clear();
	void display() const;
};

#include "hash_map.cpp"

#endif //_hashmap_hpp_