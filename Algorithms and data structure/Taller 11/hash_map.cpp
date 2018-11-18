#ifndef _hashmap_cpp_
#define _hashmap_cpp_

#include "hash_map.hpp"

template<typename dataType>
std::size_t hashf<dataType>::operator()(const dataType & key) 
{
	return static_cast<std::size_t>(key);
}

template<typename keyType, typename valueType>
std::size_t hash_map<keyType, valueType>::hashing(const keyType & key) 
{
	hashf<keyType> hashfunc;
	return hashfunc(key) % nBuckets;
}

template<typename keyType, typename valueType>
hash_map<keyType, valueType>::hash_map() 
{
	count = 0;
	nBuckets = PRIME_INITIAL_DIMENSION;
	table = new std::list<hash_map::pair>[nBuckets] {};
}

template<typename keyType, typename valueType>
hash_map<keyType, valueType>::~hash_map()\
{
	clear();
}

template<typename keyType, typename valueType>
bool hash_map<keyType, valueType>::find(const keyType & key) 
{ 
	auto pos = table[hashing(key)];
	for(auto iter = pos.cbegin(); iter != pos.cend(); ++iter) {
		if(iter->key == key) return true;
	}

	return false;
}

template<typename keyType, typename valueType>
bool hash_map<keyType, valueType>::insert(const keyType & key, const valueType & data) 
{ 
	if(!find(key))
	{	
		table[hashing(key)].push_back(pair{key, data});
		count++;
		return true;
	}

	return false;
}

template<typename keyType, typename valueType>
bool hash_map<keyType, valueType>::remove(const keyType & key) 
{ 
	if(find(key))
	{	
		for(auto iter = table[hashing(key)].cbegin(); iter != table[hashing(key)].cend(); iter++) {
			if(iter->key == key) { 
				table[hashing(key)].erase(iter);
				break;
			}
		}

		count--;
		return true;
	}

	return false;
}

template<typename keyType, typename valueType>
void hash_map<keyType, valueType>::clear() 
{ 
	delete[] table;
	table = new std::list<hash_map::pair>[nBuckets] {};
	count = 0;
}

template<typename keyType, typename valueType>
void hash_map<keyType, valueType>::display() const
{ 
	cout << "Load factor: " << ((double)count)/nBuckets << endl;
	cout << "num elem: "  << count << endl;

	for(size_t i = 0; i < nBuckets ; ++i) {
			cout << "bucket: " << i << " size: " << table[i].size() << endl;
		}
}

#endif //_hashmap_cpp_