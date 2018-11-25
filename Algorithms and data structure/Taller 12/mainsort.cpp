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
    std::vector<int> vec1;
    std::vector<int> vec2;
    
    // fill heap
    for (int i = min; i <= max; i++) {
        int number = distribution(generator);
        vec1.push_back(number);
        vec2.push_back(number);
        //std::cout << "Inserted " << number << std::endl;
    }

    t = clock();
    heapsort(vec1);
    t = clock() - t;

    cout << "HEAPSORT: It took me " << (int)t << " clicks (" << (((float)t)/CLOCKS_PER_SEC) << " seconds)." << endl;

    t = clock();
    mergesort(vec2);
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
}
