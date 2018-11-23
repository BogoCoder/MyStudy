#include <random>
#include <iostream>
#include <vector>
#include <ctime>
#include "fast_sort.hpp"
using namespace std;

int main() {

    clock_t t;

    const int min = 1;
    const int max = 10000000;
    std::random_device rd;
    std::default_random_engine generator{rd()};
    std::uniform_int_distribution<int> distribution(min, max);
    
    // declare and initialize heap of shorts
    std::vector<int> vec;
    
    // fill heap
    for (int i = min; i <= max; i++) {
        int number = distribution(generator);
        vec.push_back(number);
        //std::cout << "Inserted " << number << std::endl;
    }

    t = clock();
    heapsort(vec);
    t = clock() - t;

    cout << "HEAPSORT: It took me " << (int)t << " clicks (" << (((float)t)/CLOCKS_PER_SEC) << " seconds)." << endl;

    vec.clear();

    for (int i = min; i <= max; i++) {
        int number = distribution(generator);
        vec.push_back(number);
        //std::cout << "Inserted " << number << std::endl;
    }

    t = clock();
    mergesort(vec);
    t = clock() - t;

    cout << "MERGESORT: It took me " << (int)t << " clicks (" << (((float)t)/CLOCKS_PER_SEC) << " seconds)." << endl;

    /*std::cout << "\nSORTED: " << std::endl;
    cout << '[';
    for (auto iter = vec.begin(); iter != vec.end(); ++iter) {
        if (iter+1 != vec.end()) {
            cout << *iter << ", ";
        }
        else {
            cout << *iter;
        }
    }
    cout << ']' << endl;*/
    return 0;
    
    return 0;
}
