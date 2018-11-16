#ifndef _BST_hpp_
#define _BST_hpp_
using namespace std;

#include <iostream>

template<typename keyType>

class BST {

private:

	struct BSTNode {
		keyType key;
		BSTNode *left, *right, *parent;
	};

	size_t count;
	BSTNode *tree;


	BSTNode * min(BSTNode * root) const;
	BSTNode * max(BSTNode * root) const;
	BSTNode * succ(BSTNode * root) const;
	BSTNode * pred(BSTNode * root) const;

public:

	BST();
	BST(const BST &rhs);
	~BST();

};

#include "BST.cpp"

#endif //_BST_hpp_