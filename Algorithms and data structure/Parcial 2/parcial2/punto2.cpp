#include <set>
#include <iostream>
using namespace std;

template<typename dataType>
bool subset(set<dataType> a, set <dataType> b) {

    for(auto it1 = a.begin(); it1 != a.end(); ++it1)
    {
        if(b.find(*it1) == b.end())
        {
            return false;
        }
    }

    return true;
}

int main() {
    std::set<int> A = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    std::set<int> B = {1, 3, 5, 7, 9};
    std::set<int> C = {-8, -6, -4, -2, 0};

    //std::cout << A << std::endl << B << std::endl;
    if (subset(A, B)) std::cout << "A is a subset of set B" << std::endl;
    else          std::cout << "A is NOT a subset of set B" << std::endl;

    //std::cout << A << std::endl << C << std::endl;
    if (subset(A, C)) std::cout << "A is a subset of set C" << std::endl;
    else          std::cout << "A is NOT a subset of set C" << std::endl;

    return 0;
}


