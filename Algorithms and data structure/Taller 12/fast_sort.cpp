#ifdef _fast_sort_hpp_ 

template<typename T>
void heapsort(std::vector<T> & items)
{
    for(int i = items.size() / 2 - 1; i >= 0; --i)
        percDown(items, i, items.size());
    for(int j = items.size() - 1; j > 0; --j){
        std::swap(items[0], items[j]);
        percDown(items, 0, j);
    }
}

template<typename T>
void percDown(std::vector<T> & A, int i, int n)
{
    int largest = i;
    int l = 2*i + 1, r = 2*i + 2;

    if(l < n && A[l] > A[largest])
        largest = l;

    if(r < n && A[r] > A[largest])
        largest = r;

    if(largest != i){
        std::swap(A[i],A[largest]);
        percDown(A, largest, n);
    }

}

template<typename T>
void mergesort(std::vector<T> & items){
    std::vector<T> tmparray(items.size());
    mergesort(items, tmparray, 0, items.size() - 1);
}

template<typename T>
void mergesort(std::vector<T> & items, std::vector<T> & tmparray, int left, int right){
    if (left < right) { 
        int center = (left + right)/2;
        mergesort(items, tmparray, left, center);
        mergesort(items, tmparray, center+1, right);
        merge(items, tmparray, left, center+1, right);
    }
}

template<typename T>
void merge(std::vector<T> & items, std::vector<T> & tmparray, int leftPos, int rightPos, int rightEnd){
   
   int leftEnd = rightPos - 1, tmpPos = leftPos;
   int numElem = rightEnd - leftPos + 1;

    while(leftPos <= leftEnd && rightPos <= rightEnd) {
        if(items[leftPos] <= items[rightPos])
            tmparray[tmpPos++] = items[leftPos++];
        else tmparray[tmpPos++] = items[rightPos++];
    }

    while(leftPos <= leftEnd)
        tmparray[tmpPos++] = items[leftPos++];

    while(rightPos <= rightEnd)
        tmparray[tmpPos++] = items[rightPos++];

    for(int i = 0; i < numElem; ++i, --rightEnd)
        items[rightEnd] = tmparray[rightEnd];
}
#endif /* _fast_sort_hpp_ */
