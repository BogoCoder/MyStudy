#ifndef _BST_cpp_
#define _BST_cpp_

#include "BST.hpp"
template<typename keyType>
typename BST<keyType>::BSTNode * BST<keyType>::min(BSTNode * root) const
{
	const BSTNode * curr = root;
	if(curr->left == nullptr){

		return curr;
	}

	else return min(curr->left);
}

template<typename keyType>
typename BST<keyType>::BSTNode * BST<keyType>::max(BSTNode * root) const
{
	const BSTNode * curr = root;
	if(curr->right == nullptr){

		return curr;
	}

	else return max(curr->right);
}

template<typename keyType>
typename BST<keyType>::BSTNode * BST<keyType>::pred(BSTNode * root) const
{
	BSTNode * curr = root;
	if(curr == nullptr) return curr;

	else if(curr->left == nullptr) return nullptr;

	else{

		curr = curr->left;

		while(curr != nullptr){
			curr = curr->right;
		}
	}
}

template<typename keyType>
typename BST<keyType>::BSTNode * BST<keyType>::succ(BSTNode * root) const
{
	BSTNode * curr = root;
	if(curr == nullptr) return curr;

	else if(curr->right == nullptr) return nullptr;

	else{

		curr = curr->right;

		while(curr != nullptr){
			curr = curr->left;
		}
	}
}


#endif //_BST_cpp_