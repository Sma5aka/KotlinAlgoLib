package Sort

fun <T: Comparable<T>> selectionSort (array: Array<T>) {
    val length = array.size-1
    for (i in 0..length) {
        var inx = i
        for (j in i+1..length) {
            if (array[j] < array[inx]) inx = j
        }
        swapElements(array, i, inx)
    }
}