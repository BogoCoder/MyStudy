#ifdef heap_hpp

template <typename DataType>
BinaryHeap<DataType>::BinaryHeap(int capacity) {
    count = 0;
    array = std::vector<DataType>(capacity);
}

/**
 * Inserta elem, permite duplicados
 */
template <typename DataType>
void BinaryHeap<DataType>::insert(const DataType & elem) {
    if(count == array.size() - 1) 
        array.resize(array.size() * 2);

    int hole = ++count;
    DataType copy = elem;

    array[0] = std::move(copy);

    for(; elem < array[hole/2]; hole /= 2) 
        array[hole] = std::move(array[hole/2]);

    array[hole] = std::move(array[0]);  
}

/**
 * Retorna verdadero si el heap esta vacio, falso de lo contrario
 */
template <typename DataType>
bool BinaryHeap<DataType>::isEmpty() const {
    return count == 0;
}

/**
 * Retorna el elemento minimo en el heap.
 * Lanza una excepcion si el heap esta vacio
 */
template <typename DataType>
const DataType & BinaryHeap<DataType>::findMin() const {
    if (count > 0) {
        return array[1];
    } else {
        throw std::underflow_error("Tried to find element in empty heap");
    }
}

/**
 * Elimina el elemento minimo del heap.
 * Lanza excepcion si el heapesta vacio.
 */
template <typename DataType>
void BinaryHeap<DataType>::deleteMin() {

    if(isEmpty())
        throw std::underflow_error("Tried to delete min element in empty heap");

    array[1] = std::move(array[count--]);
    percolateDown(1);  
}

/**
 * Metodo privado para percolar hacia abajo un hueco creado
 * (e.g. al eliminar un eemento).
 */
template <typename DataType>
void BinaryHeap<DataType>::percolateDown(int hole) {

    int child;
    DataType tmp = std::move(array[hole]);

    for(; hole*2 <= (int)count; hole = child){

        child = hole * 2;

        if(child != (int)count && array[child + 1] < array[child]) 
            ++child;

        if(array[child] < tmp)
            array[hole] = std::move(array[child]);

        else
            break;
    }
    
    array[hole] = std::move(tmp);
}

/**
 * Muestra todos los elementos del heap en salida estandar
 */
template <typename DataType>
void BinaryHeap<DataType>::display() const {
    for(unsigned int i = 1; i <= count; ++i ){
        std::cout << array[i];
        std::cout << std::endl;
    }
}


#endif /* heap_hpp */
