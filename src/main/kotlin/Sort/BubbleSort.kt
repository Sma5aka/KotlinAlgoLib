package Sort

fun <T: Comparable<T>> bubbleSort(array: Array<T>) {
    val length = array.size - 1
    for (i in 0..length) {
        var isSwapped = false
        for (j in 1..length) {
            if (array[j] < array[j-1]) {
                isSwapped = true
                swapElements(array, j, j-1)
            }
        }
        if (!isSwapped) break
    }
}

fun <T: Comparable<T>> swapElements(array: Array<T>, inx1: Int, inx2: Int) {
    array[inx1] = array[inx2].also {
        array[inx2] = array[inx1]
    }

}