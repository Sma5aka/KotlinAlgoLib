package Sort

fun <T: Comparable<T>> insertionSort(array: Array<T>){
    val size = array.size-1
    for (i in 1..size) {
        val key = array[i]
        var inx = i

        for (j in i-1 downTo 0) {
            if (array[j].compareTo(key) > 0) {
                array[j+1] = array[j]
                inx = j
            } else break
        }
        array[inx] = key
    }
}